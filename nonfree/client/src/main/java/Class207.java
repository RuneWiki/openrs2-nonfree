import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class207 {

	@OriginalMember(owner = "client!ri", name = "y", descriptor = "I")
	public int anInt6356;

	@OriginalMember(owner = "client!ri", name = "p", descriptor = "Z")
	public boolean aBoolean512 = false;

	@OriginalMember(owner = "client!ri", name = "n", descriptor = "Lclient!lh;")
	private Class151 aClass151_150 = new Class151(64);

	@OriginalMember(owner = "client!ri", name = "u", descriptor = "Lclient!lh;")
	public final Class151 aClass151_151 = new Class151(500);

	@OriginalMember(owner = "client!ri", name = "w", descriptor = "Lclient!lh;")
	public final Class151 aClass151_152 = new Class151(30);

	@OriginalMember(owner = "client!ri", name = "x", descriptor = "Lclient!lh;")
	public final Class151 aClass151_153 = new Class151(50);

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "Lclient!hh;")
	private final Class109 aClass109_76;

	@OriginalMember(owner = "client!ri", name = "t", descriptor = "Z")
	public boolean aBoolean513;

	@OriginalMember(owner = "client!ri", name = "j", descriptor = "Lclient!hh;")
	public final Class109 aClass109_77;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lclient!mt;IZLclient!hh;Lclient!hh;)V")
	public Class207(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class109 arg3, @OriginalArg(4) Class109 arg4) {
		this.aClass109_76 = arg3;
		this.aBoolean513 = arg2;
		this.aClass109_77 = arg4;
		if (this.aClass109_76 != null) {
			@Pc(47) int local47 = this.aClass109_76.method2324() - 1;
			this.aClass109_76.method2322(local47);
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)Lclient!bo;")
	public Class29 method4977(@OriginalArg(1) int arg0) {
		@Pc(11) Class151 local11 = this.aClass151_150;
		@Pc(21) Class29 local21;
		synchronized (this.aClass151_150) {
			local21 = (Class29) this.aClass151_150.method3288((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(42) byte[] local42 = this.aClass109_76.method2349(Static270.method1953(arg0), Static244.method5753(arg0));
		local21 = new Class29();
		local21.anInt545 = arg0;
		local21.aClass207_1 = this;
		if (local42 != null) {
			local21.method470(new Class1_Sub14(local42));
		}
		local21.method468();
		if (local21.aBoolean43) {
			local21.aBoolean40 = false;
			local21.anInt551 = 0;
		}
		if (!this.aBoolean513 && local21.aBoolean39) {
			local21.anIntArray34 = null;
			local21.aStringArray4 = null;
		}
		@Pc(88) Class151 local88 = this.aClass151_150;
		synchronized (this.aClass151_150) {
			this.aClass151_150.method3291((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IB)V")
	public void method4979() {
		@Pc(6) Class151 local6 = this.aClass151_150;
		synchronized (this.aClass151_150) {
			this.aClass151_150.method3297(5);
		}
		local6 = this.aClass151_151;
		synchronized (this.aClass151_151) {
			this.aClass151_151.method3297(5);
		}
		local6 = this.aClass151_152;
		synchronized (this.aClass151_152) {
			this.aClass151_152.method3297(5);
		}
		local6 = this.aClass151_153;
		synchronized (this.aClass151_153) {
			this.aClass151_153.method3297(5);
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(BZ)V")
	public void method4980(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean512 != arg0) {
			this.aBoolean512 = arg0;
			this.method4983();
		}
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(B)V")
	public void method4981() {
		@Pc(6) Class151 local6 = this.aClass151_150;
		synchronized (this.aClass151_150) {
			this.aClass151_150.method3299();
		}
		local6 = this.aClass151_151;
		synchronized (this.aClass151_151) {
			this.aClass151_151.method3299();
		}
		local6 = this.aClass151_152;
		synchronized (this.aClass151_152) {
			this.aClass151_152.method3299();
		}
		local6 = this.aClass151_153;
		synchronized (this.aClass151_153) {
			this.aClass151_153.method3299();
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZI)V")
	public void method4982(@OriginalArg(1) int arg0) {
		this.anInt6356 = arg0;
		@Pc(17) Class151 local17 = this.aClass151_151;
		synchronized (this.aClass151_151) {
			this.aClass151_151.method3298();
		}
		local17 = this.aClass151_152;
		synchronized (this.aClass151_152) {
			this.aClass151_152.method3298();
		}
		local17 = this.aClass151_153;
		synchronized (this.aClass151_153) {
			this.aClass151_153.method3298();
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
	public void method4983() {
		@Pc(6) Class151 local6 = this.aClass151_150;
		synchronized (this.aClass151_150) {
			this.aClass151_150.method3298();
		}
		local6 = this.aClass151_151;
		synchronized (this.aClass151_151) {
			this.aClass151_151.method3298();
		}
		local6 = this.aClass151_152;
		synchronized (this.aClass151_152) {
			this.aClass151_152.method3298();
		}
		local6 = this.aClass151_153;
		synchronized (this.aClass151_153) {
			this.aClass151_153.method3298();
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(BI)V")
	public void method4984(@OriginalArg(1) int arg0) {
		this.aClass151_150 = new Class151(arg0);
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(BZ)V")
	public void method4986(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean513 != arg0) {
			this.aBoolean513 = arg0;
			this.method4983();
		}
	}
}
