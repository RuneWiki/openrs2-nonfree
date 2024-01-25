import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wba")
public final class Class353 {

	@OriginalMember(owner = "client!wba", name = "o", descriptor = "Lclient!pca;")
	private Class1 aClass1_272;

	@OriginalMember(owner = "client!wba", name = "h", descriptor = "Lclient!pca;")
	public final Class1 aClass1_271 = new Class1();

	@OriginalMember(owner = "client!wba", name = "<init>", descriptor = "()V")
	public Class353() {
		this.aClass1_271.aClass1_285 = this.aClass1_271;
		this.aClass1_271.aClass1_286 = this.aClass1_271;
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(I)Lclient!pca;")
	public Class1 method7676() {
		@Pc(12) Class1 local12 = this.aClass1_271.aClass1_286;
		if (this.aClass1_271 == local12) {
			this.aClass1_272 = null;
			return null;
		} else {
			this.aClass1_272 = local12.aClass1_286;
			return local12;
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(B)Lclient!pca;")
	public Class1 method7677() {
		@Pc(13) Class1 local13 = this.aClass1_271.aClass1_285;
		if (this.aClass1_271 == local13) {
			this.aClass1_272 = null;
			return null;
		} else {
			this.aClass1_272 = local13.aClass1_285;
			return local13;
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lclient!pca;I)V")
	public void method7679(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_286 != null) {
			arg0.method7859();
		}
		arg0.aClass1_286 = this.aClass1_271.aClass1_286;
		arg0.aClass1_285 = this.aClass1_271;
		arg0.aClass1_286.aClass1_285 = arg0;
		arg0.aClass1_285.aClass1_286 = arg0;
	}

	@OriginalMember(owner = "client!wba", name = "c", descriptor = "(I)V")
	public void method7680() {
		while (true) {
			@Pc(5) Class1 local5 = this.aClass1_271.aClass1_285;
			if (this.aClass1_271 == local5) {
				this.aClass1_272 = null;
				return;
			}
			local5.method7859();
		}
	}

	@OriginalMember(owner = "client!wba", name = "d", descriptor = "(I)Lclient!pca;")
	public Class1 method7681() {
		@Pc(6) Class1 local6 = this.aClass1_272;
		if (local6 == this.aClass1_271) {
			this.aClass1_272 = null;
			return null;
		} else {
			this.aClass1_272 = local6.aClass1_286;
			return local6;
		}
	}

	@OriginalMember(owner = "client!wba", name = "e", descriptor = "(I)I")
	public int method7682() {
		@Pc(12) int local12 = 0;
		for (@Pc(16) Class1 local16 = this.aClass1_271.aClass1_285; local16 != this.aClass1_271; local16 = local16.aClass1_285) {
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lclient!wba;I)V")
	public void method7683(@OriginalArg(0) Class353 arg0) {
		this.method7685(this.aClass1_271.aClass1_285, arg0);
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(BLclient!pca;)V")
	public void method7684(@OriginalArg(1) Class1 arg0) {
		if (arg0.aClass1_286 != null) {
			arg0.method7859();
		}
		arg0.aClass1_285 = this.aClass1_271.aClass1_285;
		arg0.aClass1_286 = this.aClass1_271;
		arg0.aClass1_286.aClass1_285 = arg0;
		arg0.aClass1_285.aClass1_286 = arg0;
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lclient!pca;ILclient!wba;)V")
	private void method7685(@OriginalArg(0) Class1 arg0, @OriginalArg(2) Class353 arg1) {
		@Pc(11) Class1 local11 = this.aClass1_271.aClass1_286;
		this.aClass1_271.aClass1_286 = arg0.aClass1_286;
		arg0.aClass1_286.aClass1_285 = this.aClass1_271;
		if (this.aClass1_271 != arg0) {
			arg0.aClass1_286 = arg1.aClass1_271.aClass1_286;
			arg0.aClass1_286.aClass1_285 = arg0;
			arg1.aClass1_271.aClass1_286 = local11;
			local11.aClass1_285 = arg1.aClass1_271;
		}
	}

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "(B)Z")
	public boolean method7686() {
		return this.aClass1_271.aClass1_285 == this.aClass1_271;
	}

	@OriginalMember(owner = "client!wba", name = "f", descriptor = "(I)Lclient!pca;")
	public Class1 method7687() {
		@Pc(6) Class1 local6 = this.aClass1_272;
		if (local6 == this.aClass1_271) {
			this.aClass1_272 = null;
			return null;
		} else {
			this.aClass1_272 = local6.aClass1_285;
			return local6;
		}
	}

	@OriginalMember(owner = "client!wba", name = "c", descriptor = "(B)Lclient!pca;")
	public Class1 method7688() {
		@Pc(12) Class1 local12 = this.aClass1_271.aClass1_285;
		if (this.aClass1_271 == local12) {
			return null;
		} else {
			local12.method7859();
			return local12;
		}
	}
}
