import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
public final class Class267 implements Interface19 {

	@OriginalMember(owner = "client!qo", name = "h", descriptor = "Lclient!xa;")
	private Class71 aClass71_44;

	@OriginalMember(owner = "client!qo", name = "l", descriptor = "Lclient!pj;")
	private final Class248 aClass248_81;

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "Lclient!os;")
	private final Class240 aClass240_1;

	static {
		new Class195("", 73);
	}

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lclient!pj;Lclient!os;)V")
	public Class267(@OriginalArg(0) Class248 arg0, @OriginalArg(1) Class240 arg1) {
		this.aClass248_81 = arg0;
		this.aClass240_1 = arg1;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method6772() {
		return this.aClass248_81.method5804(this.aClass240_1.anInt6969);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V")
	@Override
	public void method6770() {
		this.aClass71_44 = Static535.method7285(this.aClass248_81.method5795(this.aClass240_1.anInt6969));
		this.method6771();
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IZ)V")
	@Override
	public void method6771() {
		@Pc(16) int local16 = Static168.anInt3084 >= Static367.anInt6719 ? Static168.anInt3084 : Static367.anInt6719;
		@Pc(23) int local23 = Static112.anInt1892 < Static154.anInt2867 ? Static154.anInt2867 : Static112.anInt1892;
		this.aClass71_44.method7774(0, 0, local16, local23);
	}
}
