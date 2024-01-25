import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class137 {

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "Lclient!er;")
	private final Class69 aClass69_36 = new Class69(64);

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "Lclient!ns;")
	private final Class166 aClass166_150;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lclient!go;ILclient!ns;)V")
	public Class137(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class166 arg2) {
		this.aClass166_150 = arg2;
		this.aClass166_150.method3691(5);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)Lclient!nb;")
	public Class4_Sub1_Sub11 method2949(@OriginalArg(0) int arg0) {
		@Pc(6) Class69 local6 = this.aClass69_36;
		@Pc(16) Class4_Sub1_Sub11 local16;
		synchronized (this.aClass69_36) {
			local16 = (Class4_Sub1_Sub11) this.aClass69_36.method1591((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(44) byte[] local44 = this.aClass166_150.method3696(arg0, 5);
		local16 = new Class4_Sub1_Sub11();
		if (local44 != null) {
			local16.method3546(new Class4_Sub30(local44));
		}
		@Pc(60) Class69 local60 = this.aClass69_36;
		synchronized (this.aClass69_36) {
			this.aClass69_36.method1590((long) arg0, local16);
			return local16;
		}
	}
}
