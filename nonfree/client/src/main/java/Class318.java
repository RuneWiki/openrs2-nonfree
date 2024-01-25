import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class318 {

	@OriginalMember(owner = "client!td", name = "d", descriptor = "Lclient!gw;")
	private final Class136 aClass136_62 = new Class136(64);

	@OriginalMember(owner = "client!td", name = "c", descriptor = "Lclient!uu;")
	private final Class343 aClass343_242;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "I")
	public final int anInt9061;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lclient!gp;ILclient!uu;)V")
	public Class318(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class343 arg2) {
		this.aClass343_242 = arg2;
		this.anInt9061 = this.aClass343_242.method8157(19);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IB)Lclient!iea;")
	public Class159 method7783(@OriginalArg(0) int arg0) {
		@Pc(11) Class136 local11 = this.aClass136_62;
		@Pc(21) Class159 local21;
		synchronized (this.aClass136_62) {
			local21 = (Class159) this.aClass136_62.method3134((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class343 local34 = this.aClass343_242;
		@Pc(43) byte[] local43;
		synchronized (this.aClass343_242) {
			local43 = this.aClass343_242.method8132(19, arg0);
		}
		local21 = new Class159();
		if (local43 != null) {
			local21.method4003(new Class3_Sub9(local43));
		}
		@Pc(65) Class136 local65 = this.aClass136_62;
		synchronized (this.aClass136_62) {
			this.aClass136_62.method3135(local21, (long) arg0);
			return local21;
		}
	}
}
