import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gs")
public final class Class104 {

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "Lclient!lh;")
	private final Class151 aClass151_64 = new Class151(128);

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "Lclient!hh;")
	private final Class109 aClass109_34;

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Lclient!mt;ILclient!hh;)V")
	public Class104(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2) {
		this.aClass109_34 = arg2;
		this.aClass109_34.method2322(1);
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(II)V")
	public void method2057() {
		@Pc(2) Class151 local2 = this.aClass151_64;
		synchronized (this.aClass151_64) {
			this.aClass151_64.method3297(5);
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(ZI)Lclient!mh;")
	public Class160 method2058(@OriginalArg(1) int arg0) {
		@Pc(6) Class151 local6 = this.aClass151_64;
		@Pc(16) Class160 local16;
		synchronized (this.aClass151_64) {
			local16 = (Class160) this.aClass151_64.method3288((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(40) byte[] local40 = this.aClass109_34.method2349(1, arg0);
		local16 = new Class160();
		if (local40 != null) {
			local16.method3553(new Class1_Sub14(local40));
		}
		@Pc(56) Class151 local56 = this.aClass151_64;
		synchronized (this.aClass151_64) {
			this.aClass151_64.method3291((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)V")
	public void method2060() {
		@Pc(6) Class151 local6 = this.aClass151_64;
		synchronized (this.aClass151_64) {
			this.aClass151_64.method3298();
		}
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(B)V")
	public void method2061() {
		@Pc(2) Class151 local2 = this.aClass151_64;
		synchronized (this.aClass151_64) {
			this.aClass151_64.method3299();
		}
	}
}
