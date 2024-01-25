import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kda")
public final class Class185 {

	@OriginalMember(owner = "client!kda", name = "k", descriptor = "Lclient!cga;")
	private Class48 aClass48_2;

	@OriginalMember(owner = "client!kda", name = "g", descriptor = "Lclient!ga;")
	private final Class111 aClass111_63;

	@OriginalMember(owner = "client!kda", name = "f", descriptor = "Lclient!ga;")
	private final Class111 aClass111_62;

	@OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(Lclient!ga;Lclient!ga;)V")
	public Class185(@OriginalArg(0) Class111 arg0, @OriginalArg(1) Class111 arg1) {
		this.aClass111_63 = arg1;
		this.aClass111_62 = arg0;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)Lclient!cga;")
	private Class48 method4193() {
		if (this.aClass48_2 == null) {
			this.aClass48_2 = new Class48();
		}
		return this.aClass48_2;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(Lclient!dba;Z)Lclient!gca;")
	public Interface6 method4197(@OriginalArg(0) Interface2 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(16) Class307 local16 = arg0.method7827();
		if (local16 == Static116.aClass307_4) {
			return new Class265((Class240) arg0);
		} else if (Static305.aClass307_11 == local16) {
			return new Class24(this.method4193(), (Class96) arg0);
		} else if (Static40.aClass307_14 == local16) {
			return new Class227(this.aClass111_62, (Class251) arg0);
		} else if (Static279.aClass307_10 == local16) {
			return new Class227_Sub1(this.aClass111_62, (Class251_Sub1) arg0);
		} else if (local16 == Static445.aClass307_9) {
			return new Class72_Sub3(this.aClass111_62, this.aClass111_63, (Class175_Sub3) arg0);
		} else if (local16 == Static128.aClass307_5) {
			return new Class72_Sub2(this.aClass111_62, this.aClass111_63, (Class175_Sub2) arg0);
		} else if (local16 == Static478.aClass307_15) {
			return new Class72_Sub1(this.aClass111_62, this.aClass111_63, (Class175_Sub1) arg0);
		} else if (Static558.aClass307_17 == local16) {
			return new Class145(this.aClass111_62, this.aClass111_63, (Class226) arg0);
		} else if (Static160.aClass307_16 == local16) {
			return new Class298(this.aClass111_62, (Class353) arg0);
		} else if (local16 == Static474.aClass307_3) {
			return new Class72_Sub1_Sub1(this.aClass111_62, this.aClass111_63, (Class175_Sub1_Sub1) arg0);
		} else {
			return null;
		}
	}
}
