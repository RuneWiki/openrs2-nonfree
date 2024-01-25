import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lp")
public final class Class195 {

	@OriginalMember(owner = "client!lp", name = "h", descriptor = "Lclient!we;")
	private Class6_Sub2 aClass6_Sub2_45 = new Class6_Sub2();

	@OriginalMember(owner = "client!lp", name = "o", descriptor = "Lclient!re;")
	private final Class286 aClass286_7 = new Class286();

	@OriginalMember(owner = "client!lp", name = "k", descriptor = "I")
	private final int anInt6189;

	@OriginalMember(owner = "client!lp", name = "l", descriptor = "I")
	private int anInt6190;

	@OriginalMember(owner = "client!lp", name = "i", descriptor = "Lclient!he;")
	private final Class128 aClass128_20;

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(I)V")
	public Class195(@OriginalArg(0) int arg0) {
		this.anInt6189 = arg0;
		this.anInt6190 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass128_20 = new Class128(local19);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V")
	public void method5380() {
		this.aClass286_7.method7237();
		this.aClass128_20.method3562();
		this.aClass6_Sub2_45 = new Class6_Sub2();
		this.anInt6190 = this.anInt6189;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(JB)Lclient!we;")
	public Class6_Sub2 method5381(@OriginalArg(0) long arg0) {
		@Pc(18) Class6_Sub2 local18 = (Class6_Sub2) this.aClass128_20.method3560(arg0);
		if (local18 != null) {
			this.aClass286_7.method7239(local18);
		}
		return local18;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IJ)V")
	public void method5382(@OriginalArg(1) long arg0) {
		@Pc(16) Class6_Sub2 local16 = (Class6_Sub2) this.aClass128_20.method3560(arg0);
		if (local16 != null) {
			local16.method9043();
			local16.method8754();
			this.anInt6190++;
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(JILclient!we;)V")
	public void method5384(@OriginalArg(0) long arg0, @OriginalArg(2) Class6_Sub2 arg1) {
		if (this.anInt6190 == 0) {
			@Pc(10) Class6_Sub2 local10 = this.aClass286_7.method7244();
			local10.method9043();
			local10.method8754();
			if (this.aClass6_Sub2_45 == local10) {
				local10 = this.aClass286_7.method7244();
				local10.method9043();
				local10.method8754();
			}
		} else {
			this.anInt6190--;
		}
		this.aClass128_20.method3551(arg0, arg1);
		this.aClass286_7.method7239(arg1);
	}
}
