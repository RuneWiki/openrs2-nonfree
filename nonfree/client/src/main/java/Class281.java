import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ov")
public final class Class281 {

	@OriginalMember(owner = "client!ov", name = "h", descriptor = "[I")
	public static final int[] anIntArray400 = new int[256];

	@OriginalMember(owner = "client!ov", name = "k", descriptor = "I")
	public int anInt7543;

	@OriginalMember(owner = "client!ov", name = "l", descriptor = "Lclient!rl;")
	private final Class317 aClass317_52 = new Class317(64);

	@OriginalMember(owner = "client!ov", name = "j", descriptor = "Lclient!rl;")
	public final Class317 aClass317_53 = new Class317(60);

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "Lclient!rg;")
	public final Class310 aClass310_98;

	@OriginalMember(owner = "client!ov", name = "i", descriptor = "Lclient!rg;")
	private final Class310 aClass310_99;

	static {
		for (@Pc(73) int local73 = 0; local73 < 256; local73++) {
			@Pc(76) int local76 = local73;
			for (@Pc(78) int local78 = 0; local78 < 8; local78++) {
				if ((local76 & 0x1) == 1) {
					local76 = local76 >>> 1 ^ 0xEDB88320;
				} else {
					local76 >>>= 0x1;
				}
			}
			anIntArray400[local73] = local76;
		}
	}

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lclient!dja;ILclient!rg;Lclient!rg;)V")
	public Class281(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class310 arg2, @OriginalArg(3) Class310 arg3) {
		this.aClass310_98 = arg3;
		this.aClass310_99 = arg2;
		@Pc(26) int local26 = this.aClass310_99.method7800() - 1;
		this.aClass310_99.method7773(local26);
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)V")
	public void method6680() {
		@Pc(2) Class317 local2 = this.aClass317_52;
		synchronized (this.aClass317_52) {
			this.aClass317_52.method7873();
		}
		local2 = this.aClass317_53;
		synchronized (this.aClass317_53) {
			this.aClass317_53.method7873();
		}
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(II)V")
	public void method6683(@OriginalArg(1) int arg0) {
		this.anInt7543 = arg0;
		@Pc(16) Class317 local16 = this.aClass317_53;
		synchronized (this.aClass317_53) {
			this.aClass317_53.method7873();
		}
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IZ)V")
	public void method6684() {
		@Pc(6) Class317 local6 = this.aClass317_52;
		synchronized (this.aClass317_52) {
			this.aClass317_52.method7870(5);
		}
		local6 = this.aClass317_53;
		synchronized (this.aClass317_53) {
			this.aClass317_53.method7870(5);
		}
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Z)V")
	public void method6685() {
		@Pc(2) Class317 local2 = this.aClass317_52;
		synchronized (this.aClass317_52) {
			this.aClass317_52.method7874();
		}
		local2 = this.aClass317_53;
		synchronized (this.aClass317_53) {
			this.aClass317_53.method7874();
		}
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(BI)Lclient!ki;")
	public Class203 method6686(@OriginalArg(1) int arg0) {
		@Pc(6) Class317 local6 = this.aClass317_52;
		@Pc(16) Class203 local16;
		synchronized (this.aClass317_52) {
			local16 = (Class203) this.aClass317_52.method7882((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class310 local30 = this.aClass310_99;
		@Pc(43) byte[] local43;
		synchronized (this.aClass310_99) {
			local43 = this.aClass310_99.method7803(Static456.method6725(arg0), Static197.method2949(arg0));
		}
		local16 = new Class203();
		local16.anInt5532 = arg0;
		local16.aClass281_1 = this;
		if (local43 != null) {
			local16.method5007(new Class14_Sub21(local43));
		}
		@Pc(79) Class317 local79 = this.aClass317_52;
		synchronized (this.aClass317_52) {
			this.aClass317_52.method7875((long) arg0, local16);
			return local16;
		}
	}
}
