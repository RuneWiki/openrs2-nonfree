import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iia")
public final class Class161_Sub1 extends Class161 {

	@OriginalMember(owner = "client!iia", name = "F", descriptor = "I")
	private int anInt4429;

	@OriginalMember(owner = "client!iia", name = "G", descriptor = "[I")
	private int[] anIntArray286;

	@OriginalMember(owner = "client!iia", name = "P", descriptor = "[[B")
	private final byte[][] aByteArrayArray12 = new byte[10][];

	@OriginalMember(owner = "client!iia", name = "M", descriptor = "Lclient!sl;")
	private final Class2_Sub17 aClass2_Sub17_3 = new Class2_Sub17((byte[]) null);

	@OriginalMember(owner = "client!iia", name = "U", descriptor = "Lclient!sl;")
	private final Class2_Sub17 aClass2_Sub17_4 = new Class2_Sub17((byte[]) null);

	@OriginalMember(owner = "client!iia", name = "S", descriptor = "I")
	private final int anInt4436;

	@OriginalMember(owner = "client!iia", name = "K", descriptor = "Lclient!nd;")
	private final Class238 aClass238_113;

	@OriginalMember(owner = "client!iia", name = "<init>", descriptor = "(ILclient!nd;I)V")
	public Class161_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class238 arg1, @OriginalArg(2) int arg2) {
		super(arg0);
		this.anInt4436 = arg2;
		this.aClass238_113 = arg1;
	}

	@OriginalMember(owner = "client!iia", name = "b", descriptor = "(Z)V")
	public void method3868() {
		if (this.anIntArray286 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 10; local11++) {
			if (local11 + this.anInt4429 >= this.anIntArray286.length) {
				return;
			}
			if (this.aByteArrayArray12[local11] == null && this.aClass238_113.method5571(0, this.anIntArray286[local11 + this.anInt4429])) {
				this.aByteArrayArray12[local11] = this.aClass238_113.method5567(0, this.anIntArray286[local11 + this.anInt4429]);
			}
		}
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "([BI)I")
	@Override
	protected int method3867(@OriginalArg(0) byte[] arg0) throws IOException {
		@Pc(46) int local46;
		@Pc(52) int local52;
		if (this.anIntArray286 == null) {
			if (!this.aClass238_113.method5571(0, this.anInt4436)) {
				return 0;
			}
			@Pc(26) byte[] local26 = this.aClass238_113.method5567(0, this.anInt4436);
			if (local26 == null) {
				throw new IllegalStateException("");
			}
			this.aClass2_Sub17_4.aByteArray26 = local26;
			this.aClass2_Sub17_4.anInt3378 = 0;
			local46 = local26.length >> 1;
			this.anIntArray286 = new int[local46];
			for (local52 = 0; local52 < local46; local52++) {
				this.anIntArray286[local52] = this.aClass2_Sub17_4.method2825();
			}
		}
		if (this.anInt4429 >= this.anIntArray286.length) {
			return -1;
		}
		this.method3868();
		this.aClass2_Sub17_4.aByteArray26 = arg0;
		this.aClass2_Sub17_4.anInt3378 = 0;
		do {
			if (this.aClass2_Sub17_4.anInt3378 >= this.aClass2_Sub17_4.aByteArray26.length) {
				this.aClass2_Sub17_4.aByteArray26 = null;
				return arg0.length;
			}
			if (this.aClass2_Sub17_3.aByteArray26 == null) {
				if (this.aByteArrayArray12[0] == null) {
					this.aClass2_Sub17_4.aByteArray26 = null;
					return this.aClass2_Sub17_4.anInt3378;
				}
				this.aClass2_Sub17_3.aByteArray26 = this.aByteArrayArray12[0];
			}
			@Pc(132) int local132 = this.aClass2_Sub17_4.aByteArray26.length - this.aClass2_Sub17_4.anInt3378;
			local46 = this.aClass2_Sub17_3.aByteArray26.length - this.aClass2_Sub17_3.anInt3378;
			if (local132 < local46) {
				this.aClass2_Sub17_3.method2832(this.aClass2_Sub17_4.aByteArray26, local132, this.aClass2_Sub17_4.anInt3378);
				this.aClass2_Sub17_4.aByteArray26 = null;
				return arg0.length;
			}
			this.aClass2_Sub17_4.method2873(this.aClass2_Sub17_3.anInt3378, this.aClass2_Sub17_3.aByteArray26, local46);
			this.aClass2_Sub17_3.aByteArray26 = null;
			this.anInt4429++;
			this.aClass2_Sub17_3.anInt3378 = 0;
			for (local52 = 0; local52 < 9; local52++) {
				this.aByteArrayArray12[local52] = this.aByteArrayArray12[local52 + 1];
			}
			this.aByteArrayArray12[9] = null;
		} while (this.anInt4429 < this.anIntArray286.length);
		this.aClass2_Sub17_4.aByteArray26 = null;
		return this.aClass2_Sub17_4.anInt3378;
	}
}
