import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class349 {

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "Lclient!af;")
	private final Class10 aClass10_55 = new Class10(64);

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "Lclient!ae;")
	private final Class8 aClass8_130;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!jk;ILclient!ae;)V")
	public Class349(@OriginalArg(0) Class176 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8 arg2) {
		this.aClass8_130 = arg2;
		if (this.aClass8_130 != null) {
			this.aClass8_130.method280(11);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)V")
	public void method8153() {
		@Pc(6) Class10 local6 = this.aClass10_55;
		synchronized (this.aClass10_55) {
			this.aClass10_55.method369(5);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
	public void method8156() {
		@Pc(6) Class10 local6 = this.aClass10_55;
		synchronized (this.aClass10_55) {
			this.aClass10_55.method375();
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BI)Lclient!sp;")
	public Class325 method8157(@OriginalArg(1) int arg0) {
		@Pc(6) Class10 local6 = this.aClass10_55;
		@Pc(16) Class325 local16;
		synchronized (this.aClass10_55) {
			local16 = (Class325) this.aClass10_55.method373((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class8 local34 = this.aClass8_130;
		@Pc(43) byte[] local43;
		synchronized (this.aClass8_130) {
			local43 = this.aClass8_130.method262(arg0, 11);
		}
		local16 = new Class325();
		if (local43 != null) {
			local16.method7799(new Class6_Sub23(local43));
		}
		@Pc(65) Class10 local65 = this.aClass10_55;
		synchronized (this.aClass10_55) {
			this.aClass10_55.method366(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V")
	public void method8159() {
		@Pc(7) Class10 local7 = this.aClass10_55;
		synchronized (this.aClass10_55) {
			this.aClass10_55.method380();
		}
	}
}
