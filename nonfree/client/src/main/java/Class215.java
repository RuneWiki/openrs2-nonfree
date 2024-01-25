import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public final class Class215 {

	@OriginalMember(owner = "client!kq", name = "k", descriptor = "Lclient!si;")
	private final Class338 aClass338_31 = new Class338(64);

	@OriginalMember(owner = "client!kq", name = "f", descriptor = "Lclient!lb;")
	private final Class221 aClass221_96;

	@OriginalMember(owner = "client!kq", name = "g", descriptor = "Lclient!lb;")
	private final Class221 aClass221_98;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(ILclient!lb;Lclient!lb;)V")
	public Class215(@OriginalArg(0) int arg0, @OriginalArg(1) Class221 arg1, @OriginalArg(2) Class221 arg2) {
		this.aClass221_96 = arg1;
		this.aClass221_98 = arg2;
		if (this.aClass221_96 != null) {
			this.aClass221_96.method5065(0);
		}
		if (this.aClass221_98 != null) {
			this.aClass221_98.method5065(0);
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)Lclient!uu;")
	public Class3_Sub4_Sub21 method5026(@OriginalArg(0) int arg0) {
		@Pc(11) Class3_Sub4_Sub21 local11 = (Class3_Sub4_Sub21) this.aClass338_31.method8049((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(37) byte[] local37;
		if (arg0 < 32768) {
			local37 = this.aClass221_96.method5089(arg0, 0);
		} else {
			local37 = this.aClass221_98.method5089(arg0 & 0x7FFF, 0);
		}
		local11 = new Class3_Sub4_Sub21();
		if (local37 != null) {
			local11.method8855(new Class3_Sub28(local37));
		}
		if (arg0 >= 32768) {
			local11.method8852();
		}
		this.aClass338_31.method8044((long) arg0, local11);
		return local11;
	}
}
