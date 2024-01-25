import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public final class Class129 implements Interface27 {

	@OriginalMember(owner = "client!gk", name = "g", descriptor = "Lclient!da;")
	private Class63 aClass63_3;

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "Lclient!ar;")
	private final Class21 aClass21_1;

	@OriginalMember(owner = "client!gk", name = "h", descriptor = "Lclient!uu;")
	private final Class343 aClass343_93;

	@OriginalMember(owner = "client!gk", name = "j", descriptor = "Lclient!uu;")
	private final Class343 aClass343_94;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lclient!uu;Lclient!uu;Lclient!ar;)V")
	public Class129(@OriginalArg(0) Class343 arg0, @OriginalArg(1) Class343 arg1, @OriginalArg(2) Class21 arg2) {
		this.aClass21_1 = arg2;
		this.aClass343_93 = arg0;
		this.aClass343_94 = arg1;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
	@Override
	public void method8107() {
		@Pc(11) Class93 local11 = Static382.method6021(this.aClass21_1.anInt353, this.aClass343_94);
		this.aClass63_3 = Static266.aClass82_8.method6127(local11, Static656.method6341(this.aClass343_93, this.aClass21_1.anInt353));
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8108() {
		@Pc(23) int local23 = this.aClass21_1.aClass293_1.method7212(Static623.anInt9971, this.aClass21_1.anInt346) + this.aClass21_1.anInt342;
		@Pc(37) int local37 = this.aClass21_1.aClass15_1.method259(this.aClass21_1.anInt358, Static269.anInt5258) + this.aClass21_1.anInt354;
		this.aClass63_3.method7749(this.aClass21_1.anInt357, this.aClass21_1.anInt350, this.aClass21_1.anInt348, this.aClass21_1.anInt352, (int[]) null, this.aClass21_1.anInt358, (Class1) null, local23, this.aClass21_1.aString2, 0, this.aClass21_1.anInt346, (Class103[]) null, this.aClass21_1.anInt355, local37, 0);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8109() {
		@Pc(5) boolean local5 = true;
		if (!this.aClass343_93.method8138(this.aClass21_1.anInt353)) {
			local5 = false;
		}
		if (!this.aClass343_94.method8138(this.aClass21_1.anInt353)) {
			local5 = false;
		}
		return local5;
	}
}
