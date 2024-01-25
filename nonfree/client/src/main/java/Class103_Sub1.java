import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class103_Sub1 extends Class103 {

	@OriginalMember(owner = "client!oe", name = "N", descriptor = "[F")
	public static final float[] aFloatArray50 = new float[16384];

	@OriginalMember(owner = "client!oe", name = "Q", descriptor = "[F")
	public static final float[] aFloatArray51 = new float[16384];

	@OriginalMember(owner = "client!oe", name = "G", descriptor = "I")
	private int anInt6915;

	@OriginalMember(owner = "client!oe", name = "P", descriptor = "[I")
	private int[] anIntArray548;

	@OriginalMember(owner = "client!oe", name = "H", descriptor = "[[B")
	private final byte[][] aByteArrayArray14 = new byte[10][];

	@OriginalMember(owner = "client!oe", name = "J", descriptor = "Lclient!ee;")
	private final Class5_Sub12 aClass5_Sub12_5 = new Class5_Sub12((byte[]) null);

	@OriginalMember(owner = "client!oe", name = "W", descriptor = "Lclient!ee;")
	private final Class5_Sub12 aClass5_Sub12_6 = new Class5_Sub12((byte[]) null);

	@OriginalMember(owner = "client!oe", name = "S", descriptor = "I")
	private final int anInt6920;

	@OriginalMember(owner = "client!oe", name = "V", descriptor = "Lclient!wu;")
	private final Class384 aClass384_99;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray51[local9] = (float) Math.sin(local7 * (double) local9);
			aFloatArray50[local9] = (float) Math.cos(local7 * (double) local9);
		}
	}

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(ILclient!wu;I)V")
	public Class103_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class384 arg1, @OriginalArg(2) int arg2) {
		super(arg0);
		this.anInt6920 = arg2;
		this.aClass384_99 = arg1;
	}

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "(I)V")
	public void method6170() {
		if (this.anIntArray548 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < 10; local17++) {
			if (this.anInt6915 + local17 >= this.anIntArray548.length) {
				return;
			}
			if (this.aByteArrayArray14[local17] == null && this.aClass384_99.method8878(0, this.anIntArray548[this.anInt6915 + local17])) {
				this.aByteArrayArray14[local17] = this.aClass384_99.method8885(this.anIntArray548[local17 + this.anInt6915], 0);
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "([BI)I")
	@Override
	protected int method6163(@OriginalArg(0) byte[] arg0) throws IOException {
		@Pc(48) int local48;
		@Pc(54) int local54;
		if (this.anIntArray548 == null) {
			if (!this.aClass384_99.method8878(0, this.anInt6920)) {
				return 0;
			}
			@Pc(28) byte[] local28 = this.aClass384_99.method8885(this.anInt6920, 0);
			if (local28 == null) {
				throw new IllegalStateException("");
			}
			this.aClass5_Sub12_6.anInt10154 = 0;
			this.aClass5_Sub12_6.aByteArray104 = local28;
			local48 = local28.length >> 1;
			this.anIntArray548 = new int[local48];
			for (local54 = 0; local54 < local48; local54++) {
				this.anIntArray548[local54] = this.aClass5_Sub12_6.method8631();
			}
		}
		if (this.anIntArray548.length <= this.anInt6915) {
			return -1;
		}
		this.method6170();
		this.aClass5_Sub12_6.aByteArray104 = arg0;
		this.aClass5_Sub12_6.anInt10154 = 0;
		do {
			if (this.aClass5_Sub12_6.anInt10154 >= this.aClass5_Sub12_6.aByteArray104.length) {
				this.aClass5_Sub12_6.aByteArray104 = null;
				return arg0.length;
			}
			if (this.aClass5_Sub12_5.aByteArray104 == null) {
				if (this.aByteArrayArray14[0] == null) {
					this.aClass5_Sub12_6.aByteArray104 = null;
					return this.aClass5_Sub12_6.anInt10154;
				}
				this.aClass5_Sub12_5.aByteArray104 = this.aByteArrayArray14[0];
			}
			@Pc(134) int local134 = this.aClass5_Sub12_6.aByteArray104.length - this.aClass5_Sub12_6.anInt10154;
			local48 = this.aClass5_Sub12_5.aByteArray104.length - this.aClass5_Sub12_5.anInt10154;
			if (local134 < local48) {
				this.aClass5_Sub12_5.method8625(this.aClass5_Sub12_6.aByteArray104, this.aClass5_Sub12_6.anInt10154, local134);
				this.aClass5_Sub12_6.aByteArray104 = null;
				return arg0.length;
			}
			this.aClass5_Sub12_6.method8651(this.aClass5_Sub12_5.anInt10154, this.aClass5_Sub12_5.aByteArray104, local48);
			this.aClass5_Sub12_5.aByteArray104 = null;
			this.aClass5_Sub12_5.anInt10154 = 0;
			this.anInt6915++;
			for (local54 = 0; local54 < 9; local54++) {
				this.aByteArrayArray14[local54] = this.aByteArrayArray14[local54 + 1];
			}
			this.aByteArrayArray14[9] = null;
		} while (this.anIntArray548.length > this.anInt6915);
		this.aClass5_Sub12_6.aByteArray104 = null;
		return this.aClass5_Sub12_6.anInt10154;
	}
}
