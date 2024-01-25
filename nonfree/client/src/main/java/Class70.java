import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public final class Class70 {

	@OriginalMember(owner = "client!en", name = "p", descriptor = "I")
	public int anInt1720;

	@OriginalMember(owner = "client!en", name = "c", descriptor = "Lclient!rp;")
	private final Class220 aClass220_10 = new Class220(64);

	@OriginalMember(owner = "client!en", name = "o", descriptor = "Lclient!rp;")
	public final Class220 aClass220_12 = new Class220(30);

	@OriginalMember(owner = "client!en", name = "k", descriptor = "Lclient!lt;")
	public final Class158 aClass158_23;

	@OriginalMember(owner = "client!en", name = "l", descriptor = "Lclient!lt;")
	private final Class158 aClass158_24;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lclient!cm;ILclient!lt;Lclient!lt;)V")
	public Class70(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class158 arg2, @OriginalArg(3) Class158 arg3) {
		this.aClass158_23 = arg3;
		this.aClass158_24 = arg2;
		@Pc(26) int local26 = this.aClass158_24.method3695() - 1;
		this.aClass158_24.method3683(local26);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(II)Lclient!vd;")
	public Class250 method1595(@OriginalArg(0) int arg0) {
		@Pc(6) Class220 local6 = this.aClass220_10;
		@Pc(16) Class250 local16;
		synchronized (this.aClass220_10) {
			local16 = (Class250) this.aClass220_10.method4990((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(45) byte[] local45 = this.aClass158_24.method3672(Static194.method4773(arg0), Static318.method4511(arg0));
		local16 = new Class250();
		local16.aClass70_2 = this;
		local16.anInt6991 = arg0;
		if (local45 != null) {
			local16.method5682(new Class6_Sub15(local45));
		}
		@Pc(67) Class220 local67 = this.aClass220_10;
		synchronized (this.aClass220_10) {
			this.aClass220_10.method4996(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ZI)V")
	public void method1596(@OriginalArg(1) int arg0) {
		this.anInt1720 = arg0;
		@Pc(9) Class220 local9 = this.aClass220_12;
		synchronized (this.aClass220_12) {
			this.aClass220_12.method4999();
		}
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V")
	public void method1597() {
		@Pc(2) Class220 local2 = this.aClass220_10;
		synchronized (this.aClass220_10) {
			this.aClass220_10.method4999();
		}
		local2 = this.aClass220_12;
		synchronized (this.aClass220_12) {
			this.aClass220_12.method4999();
		}
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(II)V")
	public void method1598() {
		@Pc(13) Class220 local13 = this.aClass220_10;
		synchronized (this.aClass220_10) {
			this.aClass220_10.method4998(5);
		}
		local13 = this.aClass220_12;
		synchronized (this.aClass220_12) {
			this.aClass220_12.method4998(5);
		}
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(B)V")
	public void method1599() {
		@Pc(2) Class220 local2 = this.aClass220_10;
		synchronized (this.aClass220_10) {
			this.aClass220_10.method4987();
		}
		local2 = this.aClass220_12;
		synchronized (this.aClass220_12) {
			this.aClass220_12.method4987();
		}
	}
}
