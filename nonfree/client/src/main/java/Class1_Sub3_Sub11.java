import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public class Class1_Sub3_Sub11 extends Class1_Sub3 {

	@OriginalMember(owner = "client!eh", name = "E", descriptor = "[I")
	protected int[] anIntArray339;

	@OriginalMember(owner = "client!eh", name = "I", descriptor = "I")
	protected int anInt3973;

	@OriginalMember(owner = "client!eh", name = "O", descriptor = "I")
	protected int anInt3978;

	@OriginalMember(owner = "client!eh", name = "V", descriptor = "I")
	private int anInt3983 = -1;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub11() {
		super(0, false);
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(B)Z")
	protected final boolean method3479() {
		if (this.anIntArray339 != null) {
			return true;
		} else if (this.anInt3983 >= 0) {
			@Pc(34) Class136 local34 = Static501.anInt8494 >= 0 ? Static552.method3541(Static354.aClass171_104, Static501.anInt8494, this.anInt3983) : Static552.method3547(Static354.aClass171_104, this.anInt3983);
			local34.method3549();
			this.anIntArray339 = local34.method3542();
			this.anInt3978 = local34.anInt4055;
			this.anInt3973 = local34.anInt4054;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)V")
	@Override
	public final void method7122() {
		super.method7122();
		this.anIntArray339 = null;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILclient!ge;I)V")
	@Override
	public final void method7121(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3983 = arg0.method3967();
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7125(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass225_41.method5319(arg0);
		if (super.aClass225_41.aBoolean456 && this.method3479()) {
			@Pc(29) int[] local29 = local17[0];
			@Pc(33) int[] local33 = local17[1];
			@Pc(37) int[] local37 = local17[2];
			@Pc(53) int local53 = (this.anInt3973 == Static272.anInt5156 ? arg0 : arg0 * this.anInt3973 / Static272.anInt5156) * this.anInt3978;
			@Pc(59) int local59;
			@Pc(68) int local68;
			if (this.anInt3978 == Static452.anInt7734) {
				for (local59 = 0; local59 < Static452.anInt7734; local59++) {
					local68 = this.anIntArray339[local53++];
					local37[local59] = (local68 & 0xFF) << 4;
					local33[local59] = local68 >> 4 & 0xFF0;
					local29[local59] = local68 >> 12 & 0xFF0;
				}
			} else {
				for (local59 = 0; local59 < Static452.anInt7734; local59++) {
					local68 = local59 * this.anInt3978 / Static452.anInt7734;
					@Pc(75) int local75 = this.anIntArray339[local68 + local53];
					local37[local59] = (local75 & 0xFF) << 4;
					local33[local59] = local75 >> 4 & 0xFF0;
					local29[local59] = local75 >> 12 & 0xFF0;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "(I)I")
	@Override
	public final int method7124() {
		return this.anInt3983;
	}
}
