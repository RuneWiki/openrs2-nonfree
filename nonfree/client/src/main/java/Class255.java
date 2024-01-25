import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public final class Class255 {

	@OriginalMember(owner = "client!vr", name = "f", descriptor = "Lclient!lh;")
	private final Class151 aClass151_178 = new Class151(64);

	@OriginalMember(owner = "client!vr", name = "e", descriptor = "Lclient!hh;")
	private final Class109 aClass109_96;

	@OriginalMember(owner = "client!vr", name = "d", descriptor = "I")
	public final int anInt7551;

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Lclient!mt;ILclient!hh;)V")
	public Class255(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2) {
		this.aClass109_96 = arg2;
		if (this.aClass109_96 == null) {
			this.anInt7551 = 0;
		} else {
			this.anInt7551 = this.aClass109_96.method2322(16);
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IB)V")
	public void method5815() {
		@Pc(7) Class151 local7 = this.aClass151_178;
		synchronized (this.aClass151_178) {
			this.aClass151_178.method3297(5);
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(II)Lclient!un;")
	public Class245 method5817(@OriginalArg(0) int arg0) {
		@Pc(6) Class151 local6 = this.aClass151_178;
		@Pc(16) Class245 local16;
		synchronized (this.aClass151_178) {
			local16 = (Class245) this.aClass151_178.method3288((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(39) byte[] local39 = this.aClass109_96.method2349(16, arg0);
		local16 = new Class245();
		if (local39 != null) {
			local16.method5546(new Class1_Sub14(local39));
		}
		@Pc(55) Class151 local55 = this.aClass151_178;
		synchronized (this.aClass151_178) {
			this.aClass151_178.method3291((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(I)V")
	public void method5818() {
		@Pc(6) Class151 local6 = this.aClass151_178;
		synchronized (this.aClass151_178) {
			this.aClass151_178.method3299();
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)V")
	public void method5819() {
		@Pc(5) Class151 local5 = this.aClass151_178;
		synchronized (this.aClass151_178) {
			this.aClass151_178.method3298();
		}
	}
}
