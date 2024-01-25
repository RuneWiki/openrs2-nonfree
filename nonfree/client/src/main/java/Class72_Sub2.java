import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public final class Class72_Sub2 extends Class72 {

	@OriginalMember(owner = "client!hp", name = "q", descriptor = "Lclient!f;")
	private Class10 aClass10_14;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lclient!ga;Lclient!ga;Lclient!mc;)V")
	public Class72_Sub2(@OriginalArg(0) Class111 arg0, @OriginalArg(1) Class111 arg1, @OriginalArg(2) Class175_Sub2 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6805() {
		return super.method6805() ? super.aClass111_80.method2434(((Class175_Sub2) super.aClass175_5).anInt5684) : false;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(BZII)V")
	@Override
	protected void method5060(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(13) int local13 = this.method5059() * super.aClass175_5.anInt9468 / 10000;
		@Pc(16) int[] local16 = new int[4];
		Static136.aClass12_8.oa(local16);
		Static136.aClass12_8.da(arg1, arg0 + 2, arg1 - -local13, super.aClass175_5.anInt9476 + arg0);
		this.aClass10_14.method7681(arg1, arg0 + 2, super.aClass175_5.anInt9468, super.aClass175_5.anInt9476);
		Static136.aClass12_8.da(local16[0], local16[1], local16[2], local16[3]);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZIBI)V")
	@Override
	protected void method5061(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		Static136.aClass12_8.method6435(arg0 - 2, arg1, super.aClass175_5.anInt9468 + 4, super.aClass175_5.anInt9476 + 2, ((Class175_Sub2) super.aClass175_5).anInt5686, 0);
		Static136.aClass12_8.method6435(arg0 - 1, arg1 + 1, super.aClass175_5.anInt9468 + 2, super.aClass175_5.anInt9476, 0, 0);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V")
	@Override
	public void method6804() {
		super.method6804();
		this.aClass10_14 = Static543.method7365(super.aClass111_80, ((Class175_Sub2) super.aClass175_5).anInt5684);
	}
}
