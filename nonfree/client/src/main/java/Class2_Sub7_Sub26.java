import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public class Class2_Sub7_Sub26 extends Class2_Sub7 {

	@OriginalMember(owner = "client!sc", name = "I", descriptor = "I")
	protected int anInt6206;

	@OriginalMember(owner = "client!sc", name = "O", descriptor = "I")
	protected int anInt6211;

	@OriginalMember(owner = "client!sc", name = "Q", descriptor = "[I")
	protected int[] anIntArray501;

	@OriginalMember(owner = "client!sc", name = "P", descriptor = "I")
	private int anInt6212 = -1;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
	public Class2_Sub7_Sub26() {
		super(0, false);
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)Z")
	protected final boolean method5292() {
		if (this.anIntArray501 != null) {
			return true;
		} else if (this.anInt6212 >= 0) {
			@Pc(29) Class241 local29 = Static386.anInt7081 < 0 ? Static558.method6370(Static203.aClass53_67, this.anInt6212) : Static558.method6373(Static203.aClass53_67, Static386.anInt7081, this.anInt6212);
			local29.method6371();
			this.anIntArray501 = local29.method6366();
			this.anInt6206 = local29.anInt7604;
			this.anInt6211 = local29.anInt7606;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(Z)I")
	@Override
	public final int method7593() {
		return this.anInt6212;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method7585(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass180_41.method4533(arg0);
		if (super.aClass180_41.aBoolean392 && this.method5292()) {
			@Pc(23) int[] local23 = local11[0];
			@Pc(27) int[] local27 = local11[1];
			@Pc(31) int[] local31 = local11[2];
			@Pc(51) int local51 = this.anInt6211 * (this.anInt6206 == Static79.anInt1658 ? arg0 : this.anInt6206 * arg0 / Static79.anInt1658);
			@Pc(57) int local57;
			@Pc(65) int local65;
			if (Static352.anInt6485 == this.anInt6211) {
				for (local57 = 0; local57 < Static352.anInt6485; local57++) {
					local65 = this.anIntArray501[local51++];
					local31[local57] = (local65 & 0xFF) << 4;
					local27[local57] = local65 >> 4 & 0xFF0;
					local23[local57] = local65 >> 12 & 0xFF0;
				}
			} else {
				for (local57 = 0; local57 < Static352.anInt6485; local57++) {
					local65 = local57 * this.anInt6211 / Static352.anInt6485;
					@Pc(114) int local114 = this.anIntArray501[local51 + local65];
					local31[local57] = (local114 & 0xFF) << 4;
					local27[local57] = local114 >> 4 & 0xFF0;
					local23[local57] = local114 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IBLclient!ps;)V")
	@Override
	public final void method7582(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub29 arg1) {
		if (arg0 == 0) {
			this.anInt6212 = arg1.method5229();
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)V")
	@Override
	public final void method7591() {
		super.method7591();
		this.anIntArray501 = null;
	}
}
