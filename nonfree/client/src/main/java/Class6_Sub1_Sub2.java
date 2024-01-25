import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class6_Sub1_Sub2 extends Class6_Sub1 {

	@OriginalMember(owner = "client!al", name = "y", descriptor = "Lclient!ke;")
	private Class137 aClass137_1;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IBLjava/lang/String;)Ljava/lang/String;")
	public String method158(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass137_1 == null) {
			return arg1;
		} else {
			@Pc(16) Class6_Sub11 local16 = (Class6_Sub11) this.aClass137_1.method3175((long) arg0);
			return local16 == null ? arg1 : local16.aString14;
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!ha;II)V")
	private void method161(@OriginalArg(0) Class6_Sub15 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(14) int local14 = arg0.method3111();
		@Pc(23) int local23;
		if (this.aClass137_1 == null) {
			local23 = Static420.method5696(local14);
			this.aClass137_1 = new Class137(local23);
		}
		for (local23 = 0; local23 < local14; local23++) {
			@Pc(44) boolean local44 = arg0.method3111() == 1;
			@Pc(48) int local48 = arg0.method3078();
			@Pc(57) Class6 local57;
			if (local44) {
				local57 = new Class6_Sub11(arg0.method3093());
			} else {
				local57 = new Class6_Sub44(arg0.method3109());
			}
			this.aClass137_1.method3179((long) local48, local57);
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(BLclient!ha;)V")
	public void method164(@OriginalArg(1) Class6_Sub15 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3111();
			if (local9 == 0) {
				return;
			}
			this.method161(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(III)I")
	public int method165(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass137_1 == null) {
			return arg1;
		} else {
			@Pc(16) Class6_Sub44 local16 = (Class6_Sub44) this.aClass137_1.method3175((long) arg0);
			return local16 == null ? arg1 : local16.anInt7027;
		}
	}
}
