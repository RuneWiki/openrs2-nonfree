import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class266 {

	@OriginalMember(owner = "client!or", name = "c", descriptor = "I")
	public int anInt7797 = 0;

	@OriginalMember(owner = "client!or", name = "h", descriptor = "I")
	public int anInt7799 = 0;

	@OriginalMember(owner = "client!or", name = "i", descriptor = "Lclient!oo;")
	private final Class264 aClass264_51 = new Class264(64);

	@OriginalMember(owner = "client!or", name = "o", descriptor = "Lclient!wc;")
	private Interface27 anInterface27_1 = null;

	@OriginalMember(owner = "client!or", name = "e", descriptor = "Lclient!wia;")
	private final Class386 aClass386_98;

	@OriginalMember(owner = "client!or", name = "j", descriptor = "Lclient!wia;")
	private final Class386 aClass386_100;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(ILclient!wia;Lclient!wia;Lclient!wc;)V")
	public Class266(@OriginalArg(0) int arg0, @OriginalArg(1) Class386 arg1, @OriginalArg(2) Class386 arg2, @OriginalArg(3) Interface27 arg3) {
		this.aClass386_98 = arg2;
		this.anInterface27_1 = arg3;
		this.aClass386_100 = arg1;
		if (this.aClass386_100 != null) {
			this.anInt7799 = this.aClass386_100.method9210(1);
		}
		if (this.aClass386_98 != null) {
			this.anInt7797 = this.aClass386_98.method9210(1);
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!uh;JB[I)Ljava/lang/String;")
	public String method6435(@OriginalArg(0) Class352 arg0, @OriginalArg(1) long arg1, @OriginalArg(3) int[] arg2) {
		if (this.anInterface27_1 != null) {
			@Pc(19) String local19 = this.anInterface27_1.method6040(arg0, arg2, arg1);
			if (local19 != null) {
				return local19;
			}
		}
		return Long.toString(arg1);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IB)Lclient!vda;")
	public Class14_Sub3_Sub20 method6436(@OriginalArg(0) int arg0) {
		@Pc(21) Class14_Sub3_Sub20 local21 = (Class14_Sub3_Sub20) this.aClass264_51.method6367((long) arg0);
		if (local21 != null) {
			return local21;
		}
		@Pc(37) byte[] local37;
		if (arg0 < 32768) {
			local37 = this.aClass386_100.method9196(arg0, 1);
		} else {
			local37 = this.aClass386_98.method9196(arg0 & 0x7FFF, 1);
		}
		local21 = new Class14_Sub3_Sub20();
		local21.aClass266_2 = this;
		if (local37 != null) {
			local21.method8794(new Class14_Sub29(local37));
		}
		if (arg0 >= 32768) {
			local21.method8785();
		}
		this.aClass264_51.method6364((long) arg0, local21);
		return local21;
	}
}
