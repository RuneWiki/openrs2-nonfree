import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jga")
public final class Class172 {

	@OriginalMember(owner = "client!jga", name = "c", descriptor = "Lclient!pca;")
	private Class1 aClass1_121;

	@OriginalMember(owner = "client!jga", name = "e", descriptor = "Lclient!kea;")
	private Class187 aClass187_18;

	@OriginalMember(owner = "client!jga", name = "g", descriptor = "I")
	private int anInt4480 = 0;

	@OriginalMember(owner = "client!jga", name = "<init>", descriptor = "()V")
	private Class172() {
	}

	@OriginalMember(owner = "client!jga", name = "<init>", descriptor = "(Lclient!kea;)V")
	public Class172(@OriginalArg(0) Class187 arg0) {
		this.aClass187_18 = arg0;
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(I)Lclient!pca;")
	public Class1 method3635() {
		this.anInt4480 = 0;
		return this.method3640();
	}

	@OriginalMember(owner = "client!jga", name = "d", descriptor = "(I)Lclient!pca;")
	public Class1 method3640() {
		@Pc(20) Class1 local20;
		if (this.anInt4480 > 0 && this.aClass1_121 != this.aClass187_18.aClass1Array1[this.anInt4480 - 1]) {
			local20 = this.aClass1_121;
			this.aClass1_121 = local20.aClass1_285;
			return local20;
		}
		while (this.anInt4480 < this.aClass187_18.anInt4697) {
			local20 = this.aClass187_18.aClass1Array1[this.anInt4480++].aClass1_285;
			if (this.aClass187_18.aClass1Array1[this.anInt4480 - 1] != local20) {
				this.aClass1_121 = local20.aClass1_285;
				return local20;
			}
		}
		return null;
	}
}
