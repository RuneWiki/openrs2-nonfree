import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public class Class3_Sub2_Sub4 extends Class3_Sub2 {

	@OriginalMember(owner = "client!bh", name = "F", descriptor = "[I")
	protected int[] anIntArray131;

	@OriginalMember(owner = "client!bh", name = "I", descriptor = "I")
	protected int anInt1997;

	@OriginalMember(owner = "client!bh", name = "K", descriptor = "I")
	protected int anInt1999;

	@OriginalMember(owner = "client!bh", name = "J", descriptor = "I")
	private int anInt1998 = -1;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub4() {
		super(0, false);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!dc;II)V")
	@Override
	public final void method8663(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1998 = arg0.method5610();
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V")
	@Override
	public final void method8666() {
		super.method8666();
		this.anIntArray131 = null;
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "(B)Z")
	protected final boolean method1676() {
		if (this.anIntArray131 != null) {
			return true;
		} else if (this.anInt1998 >= 0) {
			@Pc(35) Class251 local35 = Static15.anInt237 >= 0 ? Static656.method6331(Static408.aClass343_193, Static15.anInt237, this.anInt1998) : Static656.method6339(Static408.aClass343_193, this.anInt1998);
			local35.method6334();
			this.anIntArray131 = local35.method6336();
			this.anInt1997 = local35.anInt7185;
			this.anInt1999 = local35.anInt7184;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8665(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass296_41.method7238(arg0);
		if (super.aClass296_41.aBoolean608 && this.method1676()) {
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			@Pc(59) int local59 = (Static414.anInt7271 == this.anInt1999 ? arg0 : arg0 * this.anInt1999 / Static414.anInt7271) * this.anInt1997;
			@Pc(65) int local65;
			@Pc(73) int local73;
			if (Static201.anInt3738 == this.anInt1997) {
				for (local65 = 0; local65 < Static201.anInt3738; local65++) {
					local73 = this.anIntArray131[local59++];
					local39[local65] = (local73 & 0xFF) << 4;
					local35[local65] = local73 >> 4 & 0xFF0;
					local31[local65] = local73 >> 12 & 0xFF0;
				}
			} else {
				for (local65 = 0; local65 < Static201.anInt3738; local65++) {
					local73 = local65 * this.anInt1997 / Static201.anInt3738;
					@Pc(121) int local121 = this.anIntArray131[local59 + local73];
					local39[local65] = (local121 & 0xFF) << 4;
					local35[local65] = local121 >> 4 & 0xFF0;
					local31[local65] = local121 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)I")
	@Override
	public final int method8662() {
		return this.anInt1998;
	}
}
