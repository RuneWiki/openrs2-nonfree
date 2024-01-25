import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class233 {

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "Lclient!pia;")
	private Class262 aClass262_2;

	@OriginalMember(owner = "client!nm", name = "l", descriptor = "Lclient!kha;")
	private final Class181 aClass181_71;

	@OriginalMember(owner = "client!nm", name = "k", descriptor = "Lclient!kha;")
	private final Class181 aClass181_70;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lclient!kha;Lclient!kha;)V")
	public Class233(@OriginalArg(0) Class181 arg0, @OriginalArg(1) Class181 arg1) {
		this.aClass181_71 = arg0;
		this.aClass181_70 = arg1;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!ada;I)Lclient!bq;")
	public Interface4 method6045(@OriginalArg(0) Interface1 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(25) Class275 local25 = arg0.method8059();
		if (local25 == Static614.aClass275_10) {
			return new Class245((Class213) arg0);
		} else if (local25 == Static141.aClass275_1) {
			return new Class182(this.method6048(), (Class169) arg0);
		} else if (Static446.aClass275_7 == local25) {
			return new Class52(this.aClass181_71, (Class102) arg0);
		} else if (local25 == Static155.aClass275_2) {
			return new Class52_Sub1(this.aClass181_71, (Class102_Sub1) arg0);
		} else if (Static555.aClass275_8 == local25) {
			return new Class39_Sub2(this.aClass181_71, this.aClass181_70, (Class41_Sub2) arg0);
		} else if (local25 == Static216.aClass275_3) {
			return new Class39_Sub3(this.aClass181_71, this.aClass181_70, (Class41_Sub3) arg0);
		} else if (local25 == Static423.aClass275_5) {
			return new Class39_Sub1(this.aClass181_71, this.aClass181_70, (Class41_Sub1) arg0);
		} else if (local25 == Static441.aClass275_6) {
			return new Class357(this.aClass181_71, this.aClass181_70, (Class192) arg0);
		} else if (Static612.aClass275_9 == local25) {
			return new Class250(this.aClass181_71, (Class12) arg0);
		} else if (Static314.aClass275_4 == local25) {
			return new Class39_Sub1_Sub1(this.aClass181_71, this.aClass181_70, (Class41_Sub1_Sub1) arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Z)Lclient!pia;")
	private Class262 method6048() {
		if (this.aClass262_2 == null) {
			this.aClass262_2 = new Class262();
		}
		return this.aClass262_2;
	}
}
