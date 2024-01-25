import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class243 {

	@OriginalMember(owner = "client!nh", name = "i", descriptor = "Lclient!pca;")
	private Class12_Sub7 aClass12_Sub7_6;

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "Lclient!pca;")
	public final Class12_Sub7 aClass12_Sub7_5 = new Class12_Sub7();

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
	public Class243() {
		this.aClass12_Sub7_5.aClass12_Sub7_9 = this.aClass12_Sub7_5;
		this.aClass12_Sub7_5.aClass12_Sub7_10 = this.aClass12_Sub7_5;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILclient!pca;)V")
	public void method5914(@OriginalArg(1) Class12_Sub7 arg0) {
		if (arg0.aClass12_Sub7_10 != null) {
			arg0.method8526();
		}
		arg0.aClass12_Sub7_9 = this.aClass12_Sub7_5;
		arg0.aClass12_Sub7_10 = this.aClass12_Sub7_5.aClass12_Sub7_10;
		arg0.aClass12_Sub7_10.aClass12_Sub7_9 = arg0;
		arg0.aClass12_Sub7_9.aClass12_Sub7_10 = arg0;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
	public void method5915() {
		while (true) {
			@Pc(13) Class12_Sub7 local13 = this.aClass12_Sub7_5.aClass12_Sub7_9;
			if (local13 == this.aClass12_Sub7_5) {
				this.aClass12_Sub7_6 = null;
				return;
			}
			local13.method8526();
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)Lclient!pca;")
	public Class12_Sub7 method5916() {
		@Pc(13) Class12_Sub7 local13 = this.aClass12_Sub7_6;
		if (this.aClass12_Sub7_5 == local13) {
			this.aClass12_Sub7_6 = null;
			return null;
		} else {
			this.aClass12_Sub7_6 = local13.aClass12_Sub7_9;
			return local13;
		}
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)Lclient!pca;")
	public Class12_Sub7 method5917() {
		@Pc(11) Class12_Sub7 local11 = this.aClass12_Sub7_5.aClass12_Sub7_9;
		if (this.aClass12_Sub7_5 == local11) {
			this.aClass12_Sub7_6 = null;
			return null;
		} else {
			this.aClass12_Sub7_6 = local11.aClass12_Sub7_9;
			return local11;
		}
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)I")
	public int method5918() {
		@Pc(12) int local12 = 0;
		@Pc(16) Class12_Sub7 local16 = this.aClass12_Sub7_5.aClass12_Sub7_9;
		while (local16 != this.aClass12_Sub7_5) {
			local16 = local16.aClass12_Sub7_9;
			local12++;
		}
		return local12;
	}
}
