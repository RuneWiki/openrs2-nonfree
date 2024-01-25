import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class339 implements Interface9 {

	@OriginalMember(owner = "client!vc", name = "h", descriptor = "Lclient!la;")
	private Class45 aClass45_10;

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "Lclient!sm;")
	private final Class306 aClass306_1;

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "Lclient!vo;")
	private final Class348 aClass348_124;

	@OriginalMember(owner = "client!vc", name = "j", descriptor = "Lclient!vo;")
	private final Class348 aClass348_126;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lclient!vo;Lclient!vo;Lclient!sm;)V")
	public Class339(@OriginalArg(0) Class348 arg0, @OriginalArg(1) Class348 arg1, @OriginalArg(2) Class306 arg2) {
		this.aClass306_1 = arg2;
		this.aClass348_124 = arg1;
		this.aClass348_126 = arg0;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8147() {
		@Pc(16) int local16 = this.aClass306_1.aClass347_12.method7949(Static370.anInt7124, this.aClass306_1.anInt9209) + this.aClass306_1.anInt9208;
		@Pc(31) int local31 = this.aClass306_1.aClass214_13.method5005(Static324.anInt6378, this.aClass306_1.anInt9215) + this.aClass306_1.anInt9210;
		this.aClass45_10.method4852(this.aClass306_1.anInt9205, null, null, this.aClass306_1.anInt9215, 0, 0, this.aClass306_1.anInt9214, this.aClass306_1.anInt9212, local31, this.aClass306_1.anInt9209, this.aClass306_1.anInt9216, this.aClass306_1.aString193, this.aClass306_1.anInt9206, null, local16);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
	@Override
	public void method8148() {
		@Pc(16) Class198 local16 = Static165.method2735(this.aClass348_124, this.aClass306_1.anInt9207);
		this.aClass45_10 = Static39.aClass7_2.method7837(local16, Static598.method2450(this.aClass348_126, this.aClass306_1.anInt9207));
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8149() {
		@Pc(10) boolean local10 = true;
		if (!this.aClass348_126.method7960(this.aClass306_1.anInt9207)) {
			local10 = false;
		}
		if (!this.aClass348_124.method7960(this.aClass306_1.anInt9207)) {
			local10 = false;
		}
		return local10;
	}
}
