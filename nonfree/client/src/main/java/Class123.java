import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class123 {

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "Lclient!lh;")
	private final Class151 aClass151_86 = new Class151(64);

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
	public int anInt3407 = 0;

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "Lclient!hh;")
	private final Class109 aClass109_47;

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
	public final int anInt3404;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!mt;ILclient!hh;)V")
	public Class123(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2) {
		this.aClass109_47 = arg2;
		this.anInt3404 = this.aClass109_47.method2322(4);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
	public void method2913() {
		@Pc(2) Class151 local2 = this.aClass151_86;
		synchronized (this.aClass151_86) {
			this.aClass151_86.method3298();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)V")
	public void method2914() {
		@Pc(2) Class151 local2 = this.aClass151_86;
		synchronized (this.aClass151_86) {
			this.aClass151_86.method3297(5);
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(II)Lclient!on;")
	public Class185 method2915(@OriginalArg(1) int arg0) {
		@Pc(6) Class151 local6 = this.aClass151_86;
		@Pc(21) Class185 local21;
		synchronized (this.aClass151_86) {
			local21 = (Class185) this.aClass151_86.method3288((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(40) byte[] local40 = this.aClass109_47.method2349(4, arg0);
		local21 = new Class185();
		local21.anInt4876 = arg0;
		local21.aClass123_3 = this;
		if (local40 != null) {
			local21.method3983(new Class1_Sub14(local40));
		}
		local21.method3984();
		@Pc(65) Class151 local65 = this.aClass151_86;
		synchronized (this.aClass151_86) {
			this.aClass151_86.method3291((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V")
	public void method2916() {
		@Pc(2) Class151 local2 = this.aClass151_86;
		synchronized (this.aClass151_86) {
			this.aClass151_86.method3299();
		}
	}
}
