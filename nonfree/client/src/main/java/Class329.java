import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class329 {

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "Lclient!aj;")
	private final Class10 aClass10_59 = new Class10(64);

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "Lclient!om;")
	private final Class246 aClass246_246;

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
	public final int anInt8330;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lclient!mea;ILclient!om;)V")
	public Class329(@OriginalArg(0) Class211 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class246 arg2) {
		this.aClass246_246 = arg2;
		this.anInt8330 = this.aClass246_246.method5673(19);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)Lclient!jh;")
	public Class166 method6989(@OriginalArg(1) int arg0) {
		@Pc(6) Class10 local6 = this.aClass10_59;
		@Pc(16) Class166 local16;
		synchronized (this.aClass10_59) {
			local16 = (Class166) this.aClass10_59.method250((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class246 local29 = this.aClass246_246;
		@Pc(38) byte[] local38;
		synchronized (this.aClass246_246) {
			local38 = this.aClass246_246.method5653(19, arg0);
		}
		local16 = new Class166();
		if (local38 != null) {
			local16.method4038(new Class3_Sub11(local38));
		}
		@Pc(62) Class10 local62 = this.aClass10_59;
		synchronized (this.aClass10_59) {
			this.aClass10_59.method254(local16, (long) arg0);
			return local16;
		}
	}
}
