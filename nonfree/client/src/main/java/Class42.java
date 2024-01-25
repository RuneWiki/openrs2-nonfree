import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class42 {

	@OriginalMember(owner = "client!co", name = "b", descriptor = "Lclient!nj;")
	private Class181 aClass181_3;

	@OriginalMember(owner = "client!co", name = "h", descriptor = "Lclient!wh;")
	private Class2 aClass2_45;

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "()V")
	public Class42() {
	}

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lclient!nj;)V")
	public Class42(@OriginalArg(0) Class181 arg0) {
		this.aClass181_3 = arg0;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(I)Lclient!wh;")
	public Class2 method904() {
		@Pc(13) Class2 local13 = this.aClass181_3.aClass2_156.aClass2_268;
		if (this.aClass181_3.aClass2_156 == local13) {
			this.aClass2_45 = null;
			return null;
		} else {
			this.aClass2_45 = local13.aClass2_268;
			return local13;
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(B)Lclient!wh;")
	public Class2 method905() {
		@Pc(11) Class2 local11 = this.aClass2_45;
		if (this.aClass181_3.aClass2_156 == local11) {
			this.aClass2_45 = null;
			return null;
		} else {
			this.aClass2_45 = local11.aClass2_268;
			return local11;
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(BLclient!nj;)V")
	public void method906(@OriginalArg(1) Class181 arg0) {
		this.aClass181_3 = arg0;
	}
}
