import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ps")
public final class Class275 {

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "Lclient!af;")
	private final Class10 aClass10_46 = new Class10(64);

	@OriginalMember(owner = "client!ps", name = "e", descriptor = "Lclient!ae;")
	private final Class8 aClass8_111;

	@OriginalMember(owner = "client!ps", name = "f", descriptor = "I")
	public final int anInt8007;

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lclient!jk;ILclient!ae;)V")
	public Class275(@OriginalArg(0) Class176 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8 arg2) {
		this.aClass8_111 = arg2;
		this.anInt8007 = this.aClass8_111.method280(19);
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(II)Lclient!ki;")
	public Class193 method6856(@OriginalArg(1) int arg0) {
		@Pc(6) Class10 local6 = this.aClass10_46;
		@Pc(16) Class193 local16;
		synchronized (this.aClass10_46) {
			local16 = (Class193) this.aClass10_46.method373((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class8 local34 = this.aClass8_111;
		@Pc(43) byte[] local43;
		synchronized (this.aClass8_111) {
			local43 = this.aClass8_111.method262(arg0, 19);
		}
		local16 = new Class193();
		if (local43 != null) {
			local16.method4404(new Class6_Sub23(local43));
		}
		@Pc(65) Class10 local65 = this.aClass10_46;
		synchronized (this.aClass10_46) {
			this.aClass10_46.method366(local16, (long) arg0);
			return local16;
		}
	}
}
