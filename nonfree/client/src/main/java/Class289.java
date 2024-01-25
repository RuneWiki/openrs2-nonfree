import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qca")
public final class Class289 {

	@OriginalMember(owner = "client!qca", name = "b", descriptor = "Lclient!oaa;")
	private Class258 aClass258_7;

	@OriginalMember(owner = "client!qca", name = "d", descriptor = "Lclient!lda;")
	private Class3_Sub6 aClass3_Sub6_52;

	@OriginalMember(owner = "client!qca", name = "<init>", descriptor = "()V")
	private Class289() {
	}

	@OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(Lclient!oaa;)V")
	public Class289(@OriginalArg(0) Class258 arg0) {
		this.aClass258_7 = arg0;
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(I)Lclient!lda;")
	public Class3_Sub6 method6827() {
		@Pc(6) Class3_Sub6 local6 = this.aClass3_Sub6_52;
		if (this.aClass258_7.aClass3_Sub6_44 == local6) {
			this.aClass3_Sub6_52 = null;
			return null;
		} else {
			this.aClass3_Sub6_52 = local6.aClass3_Sub6_67;
			return local6;
		}
	}

	@OriginalMember(owner = "client!qca", name = "b", descriptor = "(I)Lclient!lda;")
	public Class3_Sub6 method6829() {
		@Pc(14) Class3_Sub6 local14 = this.aClass258_7.aClass3_Sub6_44.aClass3_Sub6_67;
		if (local14 == this.aClass258_7.aClass3_Sub6_44) {
			this.aClass3_Sub6_52 = null;
			return null;
		} else {
			this.aClass3_Sub6_52 = local14.aClass3_Sub6_67;
			return local14;
		}
	}
}
