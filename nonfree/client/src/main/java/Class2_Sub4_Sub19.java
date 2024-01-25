import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mfa")
public class Class2_Sub4_Sub19 extends Class2_Sub4 {

	@OriginalMember(owner = "client!mfa", name = "B", descriptor = "I")
	protected int anInt7460;

	@OriginalMember(owner = "client!mfa", name = "C", descriptor = "I")
	protected int anInt7461;

	@OriginalMember(owner = "client!mfa", name = "H", descriptor = "[I")
	protected int[] anIntArray502;

	@OriginalMember(owner = "client!mfa", name = "E", descriptor = "I")
	private int anInt7463 = -1;

	@OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub19() {
		super(0, false);
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(B)I")
	@Override
	public final int method7560() {
		return this.anInt7463;
	}

	@OriginalMember(owner = "client!mfa", name = "b", descriptor = "(B)Z")
	protected final boolean method6015() {
		if (this.anIntArray502 != null) {
			return true;
		} else if (this.anInt7463 >= 0) {
			@Pc(29) Class344 local29 = Static512.anInt8185 < 0 ? Static603.method7125(Static55.aClass229_14, this.anInt7463) : Static603.method7117(Static55.aClass229_14, Static512.anInt8185, this.anInt7463);
			local29.method7116();
			this.anIntArray502 = local29.method7118();
			this.anInt7460 = local29.anInt8946;
			this.anInt7461 = local29.anInt8947;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mfa", name = "b", descriptor = "(I)V")
	@Override
	public final void method7558() {
		super.method7558();
		this.anIntArray502 = null;
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7561(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass143_41.method2531(arg0);
		if (super.aClass143_41.aBoolean214 && this.method6015()) {
			@Pc(25) int[] local25 = local13[0];
			@Pc(29) int[] local29 = local13[1];
			@Pc(33) int[] local33 = local13[2];
			@Pc(49) int local49 = (this.anInt7460 == Static42.anInt782 ? arg0 : this.anInt7460 * arg0 / Static42.anInt782) * this.anInt7461;
			@Pc(59) int local59;
			@Pc(68) int local68;
			if (this.anInt7461 == Static143.anInt7434) {
				for (local59 = 0; local59 < Static143.anInt7434; local59++) {
					local68 = this.anIntArray502[local49++];
					local33[local59] = (local68 & 0xFF) << 4;
					local29[local59] = local68 >> 4 & 0xFF0;
					local25[local59] = local68 >> 12 & 0xFF0;
				}
			} else {
				for (local59 = 0; local59 < Static143.anInt7434; local59++) {
					local68 = local59 * this.anInt7461 / Static143.anInt7434;
					@Pc(75) int local75 = this.anIntArray502[local68 + local49];
					local33[local59] = (local75 & 0xFF) << 4;
					local29[local59] = local75 >> 4 & 0xFF0;
					local25[local59] = local75 >> 12 & 0xFF0;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(ILclient!gk;B)V")
	@Override
	public final void method7566(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt7463 = arg1.method4518();
		}
	}
}
