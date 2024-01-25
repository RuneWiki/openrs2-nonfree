import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class203 implements Interface14 {

	@OriginalMember(owner = "client!kf", name = "j", descriptor = "Lclient!da;")
	private Class44 aClass44_24;

	@OriginalMember(owner = "client!kf", name = "k", descriptor = "Lclient!lb;")
	private final Class221 aClass221_94;

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "Lclient!eo;")
	private final Class99 aClass99_1;

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "Lclient!lb;")
	private final Class221 aClass221_93;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lclient!lb;Lclient!lb;Lclient!eo;)V")
	public Class203(@OriginalArg(0) Class221 arg0, @OriginalArg(1) Class221 arg1, @OriginalArg(2) Class99 arg2) {
		this.aClass221_94 = arg0;
		this.aClass99_1 = arg2;
		this.aClass221_93 = arg1;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8743() {
		@Pc(16) int local16 = this.aClass99_1.aClass304_7.method7463(this.aClass99_1.anInt2836, Static347.anInt2639) + this.aClass99_1.anInt2841;
		@Pc(30) int local30 = this.aClass99_1.aClass216_7.method5030(Static426.anInt7511, this.aClass99_1.anInt2842) + this.aClass99_1.anInt2837;
		this.aClass44_24.method8132(local30, (Class9[]) null, this.aClass99_1.anInt2843, this.aClass99_1.aString51, this.aClass99_1.anInt2838, local16, this.aClass99_1.anInt2836, (Class1) null, (int[]) null, this.aClass99_1.anInt2844, 0, this.aClass99_1.anInt2835, 0, this.aClass99_1.anInt2842, this.aClass99_1.anInt2845);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
	@Override
	public void method8745() {
		@Pc(20) Class330 local20 = Static101.method1316(this.aClass99_1.anInt2840, this.aClass221_93);
		this.aClass44_24 = Static488.aClass67_12.method7641(local20, Static728.method4755(this.aClass221_94, this.aClass99_1.anInt2840), true);
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8744() {
		@Pc(11) boolean local11 = true;
		if (!this.aClass221_94.method5068(this.aClass99_1.anInt2840)) {
			local11 = false;
		}
		if (!this.aClass221_93.method5068(this.aClass99_1.anInt2840)) {
			local11 = false;
		}
		return local11;
	}
}
