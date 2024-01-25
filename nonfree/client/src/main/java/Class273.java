import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class273 implements Interface9 {

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "Lclient!da;")
	private Class59 aClass59_10;

	@OriginalMember(owner = "client!pb", name = "j", descriptor = "Lclient!gga;")
	private final Class124 aClass124_94;

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "Lclient!gga;")
	private final Class124 aClass124_93;

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "Lclient!wda;")
	private final Class385 aClass385_1;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lclient!gga;Lclient!gga;Lclient!wda;)V")
	public Class273(@OriginalArg(0) Class124 arg0, @OriginalArg(1) Class124 arg1, @OriginalArg(2) Class385 arg2) {
		this.aClass124_94 = arg1;
		this.aClass124_93 = arg0;
		this.aClass385_1 = arg2;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7668() {
		@Pc(11) boolean local11 = true;
		if (!this.aClass124_93.method3627(this.aClass385_1.anInt11216)) {
			local11 = false;
		}
		if (!this.aClass124_94.method3627(this.aClass385_1.anInt11216)) {
			local11 = false;
		}
		return local11;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7669() {
		@Pc(20) int local20 = this.aClass385_1.aClass236_13.method6431(this.aClass385_1.anInt11220, Static26.anInt458) + this.aClass385_1.anInt11219;
		@Pc(35) int local35 = this.aClass385_1.aClass103_13.method3186(Static340.anInt6390, this.aClass385_1.anInt11211) + this.aClass385_1.anInt11210;
		this.aClass59_10.method9576(this.aClass385_1.anInt11213, this.aClass385_1.aString129, this.aClass385_1.anInt11214, this.aClass385_1.anInt11220, local20, this.aClass385_1.anInt11221, this.aClass385_1.anInt11218, this.aClass385_1.anInt11211, 0, (Class1) null, this.aClass385_1.anInt11217, 0, (int[]) null, local35, (Class71[]) null);
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V")
	@Override
	public void method7670() {
		@Pc(15) Class324 local15 = Static386.method6506(this.aClass124_94, this.aClass385_1.anInt11216);
		this.aClass59_10 = Static607.aClass101_15.method8146(local15, Static676.method1699(this.aClass124_93, this.aClass385_1.anInt11216));
	}
}
