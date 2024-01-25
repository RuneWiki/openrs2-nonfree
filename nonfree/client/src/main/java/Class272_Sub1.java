import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class272_Sub1 extends Class272 {

	@OriginalMember(owner = "client!pa", name = "W", descriptor = "I")
	private int anInt7484;

	@OriginalMember(owner = "client!pa", name = "P", descriptor = "[I")
	private int[] anIntArray458;

	@OriginalMember(owner = "client!pa", name = "R", descriptor = "[[B")
	private final byte[][] aByteArrayArray22 = new byte[10][];

	@OriginalMember(owner = "client!pa", name = "V", descriptor = "Lclient!ib;")
	private final Class5_Sub23 aClass5_Sub23_5 = new Class5_Sub23((byte[]) null);

	@OriginalMember(owner = "client!pa", name = "X", descriptor = "Lclient!ib;")
	private final Class5_Sub23 aClass5_Sub23_6 = new Class5_Sub23((byte[]) null);

	@OriginalMember(owner = "client!pa", name = "N", descriptor = "Lclient!la;")
	private final Class208 aClass208_103;

	@OriginalMember(owner = "client!pa", name = "Z", descriptor = "I")
	private final int anInt7488;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(ILclient!la;I)V")
	public Class272_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class208 arg1, @OriginalArg(2) int arg2) {
		super(arg0);
		this.aClass208_103 = arg1;
		this.anInt7488 = arg2;
	}

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "(B)V")
	public void method6475() {
		if (this.anIntArray458 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < 10; local12++) {
			if (this.anIntArray458.length <= local12 + this.anInt7484) {
				return;
			}
			if (this.aByteArrayArray22[local12] == null && this.aClass208_103.method4980(0, this.anIntArray458[local12 + this.anInt7484])) {
				this.aByteArrayArray22[local12] = this.aClass208_103.method4991(this.anIntArray458[local12 + this.anInt7484], 0, -126);
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "([BI)I")
	@Override
	protected int method6473(@OriginalArg(0) byte[] arg0) throws IOException {
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray458 == null) {
			if (!this.aClass208_103.method4980(0, this.anInt7488)) {
				return 0;
			}
			@Pc(38) byte[] local38 = this.aClass208_103.method4991(this.anInt7488, 0, 74);
			if (local38 == null) {
				throw new IllegalStateException("");
			}
			this.aClass5_Sub23_6.aByteArray102 = local38;
			this.aClass5_Sub23_6.anInt9869 = 0;
			local59 = local38.length >> 1;
			this.anIntArray458 = new int[local59];
			for (local65 = 0; local65 < local59; local65++) {
				this.anIntArray458[local65] = this.aClass5_Sub23_6.method8519();
			}
		}
		if (this.anIntArray458.length <= this.anInt7484) {
			return -1;
		}
		this.method6475();
		this.aClass5_Sub23_6.anInt9869 = 0;
		this.aClass5_Sub23_6.aByteArray102 = arg0;
		do {
			if (this.aClass5_Sub23_6.anInt9869 >= this.aClass5_Sub23_6.aByteArray102.length) {
				this.aClass5_Sub23_6.aByteArray102 = null;
				return arg0.length;
			}
			if (this.aClass5_Sub23_5.aByteArray102 == null) {
				if (this.aByteArrayArray22[0] == null) {
					this.aClass5_Sub23_6.aByteArray102 = null;
					return this.aClass5_Sub23_6.anInt9869;
				}
				this.aClass5_Sub23_5.aByteArray102 = this.aByteArrayArray22[0];
			}
			@Pc(144) int local144 = this.aClass5_Sub23_6.aByteArray102.length - this.aClass5_Sub23_6.anInt9869;
			local59 = this.aClass5_Sub23_5.aByteArray102.length - this.aClass5_Sub23_5.anInt9869;
			if (local59 > local144) {
				this.aClass5_Sub23_5.method8487(this.aClass5_Sub23_6.aByteArray102, local144, this.aClass5_Sub23_6.anInt9869);
				this.aClass5_Sub23_6.aByteArray102 = null;
				return arg0.length;
			}
			this.aClass5_Sub23_6.method8528(local59, this.aClass5_Sub23_5.anInt9869, this.aClass5_Sub23_5.aByteArray102);
			this.aClass5_Sub23_5.anInt9869 = 0;
			this.anInt7484++;
			this.aClass5_Sub23_5.aByteArray102 = null;
			for (local65 = 0; local65 < 9; local65++) {
				this.aByteArrayArray22[local65] = this.aByteArrayArray22[local65 + 1];
			}
			this.aByteArrayArray22[9] = null;
		} while (this.anInt7484 < this.anIntArray458.length);
		this.aClass5_Sub23_6.aByteArray102 = null;
		return this.aClass5_Sub23_6.anInt9869;
	}
}
