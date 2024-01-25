import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class310 {

	@OriginalMember(owner = "client!sn", name = "h", descriptor = "[I")
	public static final int[] anIntArray556 = new int[32];

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "Lclient!gw;")
	private final Class136 aClass136_59 = new Class136(16);

	@OriginalMember(owner = "client!sn", name = "i", descriptor = "Lclient!uu;")
	private final Class343 aClass343_239;

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray556[local6] = local4 - 1;
			local4 += local4;
		}
	}

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lclient!gp;ILclient!uu;)V")
	public Class310(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class343 arg2) {
		this.aClass343_239 = arg2;
		this.aClass343_239.method8157(30);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V")
	public void method7616() {
		@Pc(6) Class136 local6 = this.aClass136_59;
		synchronized (this.aClass136_59) {
			this.aClass136_59.method3142();
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)V")
	public void method7617() {
		@Pc(10) Class136 local10 = this.aClass136_59;
		synchronized (this.aClass136_59) {
			this.aClass136_59.method3132(5);
		}
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(B)V")
	public void method7621() {
		@Pc(2) Class136 local2 = this.aClass136_59;
		synchronized (this.aClass136_59) {
			this.aClass136_59.method3138();
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IZ)Lclient!lda;")
	public Class201 method7622(@OriginalArg(0) int arg0) {
		@Pc(6) Class136 local6 = this.aClass136_59;
		@Pc(16) Class201 local16;
		synchronized (this.aClass136_59) {
			local16 = (Class201) this.aClass136_59.method3134((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class343 local34 = this.aClass343_239;
		@Pc(43) byte[] local43;
		synchronized (this.aClass343_239) {
			local43 = this.aClass343_239.method8132(30, arg0);
		}
		local16 = new Class201();
		if (local43 != null) {
			local16.method5280(new Class3_Sub9(local43));
		}
		@Pc(65) Class136 local65 = this.aClass136_59;
		synchronized (this.aClass136_59) {
			this.aClass136_59.method3135(local16, (long) arg0);
			return local16;
		}
	}
}
