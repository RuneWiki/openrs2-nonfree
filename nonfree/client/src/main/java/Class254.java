import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class254 {

	@OriginalMember(owner = "client!vq", name = "g", descriptor = "Lclient!rp;")
	private Class220 aClass220_54 = new Class220(128);

	@OriginalMember(owner = "client!vq", name = "m", descriptor = "Lclient!rp;")
	public Class220 aClass220_55 = new Class220(64);

	@OriginalMember(owner = "client!vq", name = "h", descriptor = "Lclient!lt;")
	public final Class158 aClass158_91;

	@OriginalMember(owner = "client!vq", name = "k", descriptor = "Lclient!lt;")
	private final Class158 aClass158_92;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lclient!cm;ILclient!lt;Lclient!lt;)V")
	public Class254(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class158 arg2, @OriginalArg(3) Class158 arg3) {
		this.aClass158_91 = arg3;
		this.aClass158_92 = arg2;
		this.aClass158_92.method3683(36);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(BI)Lclient!gf;")
	public Class94 method5834(@OriginalArg(1) int arg0) {
		@Pc(6) Class220 local6 = this.aClass220_54;
		@Pc(16) Class94 local16;
		synchronized (this.aClass220_54) {
			local16 = (Class94) this.aClass220_54.method4990((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass158_92.method3672(arg0, 36);
		local16 = new Class94();
		local16.anInt2191 = arg0;
		local16.aClass254_4 = this;
		if (local33 != null) {
			local16.method2003(new Class6_Sub15(local33));
		}
		local16.method2006();
		@Pc(63) Class220 local63 = this.aClass220_54;
		synchronized (this.aClass220_54) {
			this.aClass220_54.method4996(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V")
	public void method5835() {
		@Pc(2) Class220 local2 = this.aClass220_54;
		synchronized (this.aClass220_54) {
			this.aClass220_54.method4999();
		}
		@Pc(29) Class220 local29 = this.aClass220_55;
		synchronized (this.aClass220_55) {
			this.aClass220_55.method4999();
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V")
	public void method5837() {
		@Pc(14) Class220 local14 = this.aClass220_54;
		synchronized (this.aClass220_54) {
			this.aClass220_54.method4987();
		}
		local14 = this.aClass220_55;
		synchronized (this.aClass220_55) {
			this.aClass220_55.method4987();
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)V")
	public void method5838() {
		@Pc(6) Class220 local6 = this.aClass220_54;
		synchronized (this.aClass220_54) {
			this.aClass220_54.method4998(5);
		}
		local6 = this.aClass220_55;
		synchronized (this.aClass220_55) {
			this.aClass220_55.method4998(5);
		}
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(III)V")
	public void method5842(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass220_54 = new Class220(arg1);
		this.aClass220_55 = new Class220(arg0);
	}
}
