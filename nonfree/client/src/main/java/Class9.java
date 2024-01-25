import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class9 {

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
	public int anInt188 = 0;

	@OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
	public int anInt189 = 0;

	@OriginalMember(owner = "client!ak", name = "f", descriptor = "Lclient!hn;")
	private final Class102 aClass102_2 = new Class102(64);

	@OriginalMember(owner = "client!ak", name = "l", descriptor = "Lclient!h;")
	private Interface4 anInterface4_1 = null;

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "Lclient!fo;")
	private final Class82 aClass82_2;

	@OriginalMember(owner = "client!ak", name = "g", descriptor = "Lclient!fo;")
	private final Class82 aClass82_3;

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(ILclient!fo;Lclient!fo;Lclient!h;)V")
	public Class9(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) Class82 arg2, @OriginalArg(3) Interface4 arg3) {
		this.aClass82_2 = arg1;
		this.aClass82_3 = arg2;
		this.anInterface4_1 = arg3;
		if (this.aClass82_2 != null) {
			this.anInt189 = this.aClass82_2.method1823(1);
		}
		if (this.aClass82_3 != null) {
			this.anInt188 = this.aClass82_3.method1823(1);
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IB)Lclient!sk;")
	public Class1_Sub5_Sub16 method145(@OriginalArg(0) int arg0) {
		@Pc(11) Class1_Sub5_Sub16 local11 = (Class1_Sub5_Sub16) this.aClass102_2.method2258((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(33) byte[] local33;
		if (arg0 < 32768) {
			local33 = this.aClass82_2.method1817(1, arg0);
		} else {
			local33 = this.aClass82_3.method1817(1, arg0 & 0x7FFF);
		}
		local11 = new Class1_Sub5_Sub16();
		local11.aClass9_1 = this;
		if (local33 != null) {
			local11.method4901(new Class1_Sub28(local33));
		}
		if (arg0 >= 32768) {
			local11.method4902();
		}
		this.aClass102_2.method2272((long) arg0, local11);
		return local11;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "([ILclient!sd;JB)Ljava/lang/String;")
	public String method146(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class220 arg1, @OriginalArg(2) long arg2) {
		if (this.anInterface4_1 != null) {
			@Pc(24) String local24 = this.anInterface4_1.method4322(arg0, arg1, arg2);
			if (local24 != null) {
				return local24;
			}
		}
		return Long.toString(arg2);
	}
}
