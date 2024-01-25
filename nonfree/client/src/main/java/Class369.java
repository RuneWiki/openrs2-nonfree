import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class369 {

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "Lclient!re;")
	private final Class286 aClass286_13 = new Class286();

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
	private final int anInt10303;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
	private int anInt10297;

	@OriginalMember(owner = "client!wd", name = "o", descriptor = "Lclient!he;")
	private final Class128 aClass128_49;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(I)V")
	public Class369(@OriginalArg(0) int arg0) {
		this.anInt10303 = arg0;
		this.anInt10297 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass128_49 = new Class128(local16);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!te;Z)V")
	private void method8704(@OriginalArg(0) Class6_Sub2_Sub10 arg0) {
		if (arg0 != null) {
			arg0.method9043();
			arg0.method8754();
			this.anInt10297 += arg0.anInt8104;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!vm;IBLjava/lang/Object;)V")
	private void method8705(@OriginalArg(0) Interface26 arg0, @OriginalArg(3) Object arg1) {
		if (this.anInt10303 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method8713(arg0);
		this.anInt10297--;
		while (this.anInt10297 < 0) {
			@Pc(34) Class6_Sub2_Sub10 local34 = (Class6_Sub2_Sub10) this.aClass286_13.method7244();
			this.method8704(local34);
		}
		@Pc(57) Class6_Sub2_Sub10_Sub2 local57 = new Class6_Sub2_Sub10_Sub2(arg0, arg1, 1);
		this.aClass128_49.method3551(arg0.method8008(), local57);
		this.aClass286_13.method7239(local57);
		local57.aLong272 = 0L;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)I")
	public int method8708() {
		return this.anInt10303;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V")
	public void method8709() {
		this.aClass286_13.method7237();
		this.aClass128_49.method3562();
		this.anInt10297 = this.anInt10303;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILclient!vm;Ljava/lang/Object;)V")
	public void method8710(@OriginalArg(1) Interface26 arg0, @OriginalArg(2) Object arg1) {
		this.method8705(arg0, arg1);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!vm;I)Ljava/lang/Object;")
	public Object method8711(@OriginalArg(0) Interface26 arg0) {
		@Pc(9) long local9 = arg0.method8008();
		for (@Pc(16) Class6_Sub2_Sub10 local16 = (Class6_Sub2_Sub10) this.aClass128_49.method3560(local9); local16 != null; local16 = (Class6_Sub2_Sub10) this.aClass128_49.method3553()) {
			if (local16.anInterface26_3.method8009(arg0)) {
				@Pc(28) Object local28 = local16.method6996();
				if (local28 != null) {
					if (local16.method6997()) {
						@Pc(67) Class6_Sub2_Sub10_Sub2 local67 = new Class6_Sub2_Sub10_Sub2(arg0, local28, local16.anInt8104);
						this.aClass128_49.method3551(local16.aLong278, local67);
						this.aClass286_13.method7239(local67);
						local67.aLong272 = 0L;
						local16.method9043();
						local16.method8754();
					} else {
						this.aClass286_13.method7239(local16);
						local16.aLong272 = 0L;
					}
					return local28;
				}
				local16.method9043();
				local16.method8754();
				this.anInt10297 += local16.anInt8104;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)V")
	public void method8712() {
		for (@Pc(7) Class6_Sub2_Sub10 local7 = (Class6_Sub2_Sub10) this.aClass286_13.method7242(); local7 != null; local7 = (Class6_Sub2_Sub10) this.aClass286_13.method7241()) {
			if (local7.method6997()) {
				local7.method9043();
				local7.method8754();
				this.anInt10297 += local7.anInt8104;
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILclient!vm;)V")
	private void method8713(@OriginalArg(1) Interface26 arg0) {
		@Pc(9) long local9 = arg0.method8008();
		for (@Pc(16) Class6_Sub2_Sub10 local16 = (Class6_Sub2_Sub10) this.aClass128_49.method3560(local9); local16 != null; local16 = (Class6_Sub2_Sub10) this.aClass128_49.method3553()) {
			if (local16.anInterface26_3.method8009(arg0)) {
				this.method8704(local16);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)I")
	public int method8714() {
		return this.anInt10297;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)V")
	public void method8717() {
		if (Static45.aClass111_1 == null) {
			return;
		}
		for (@Pc(9) Class6_Sub2_Sub10 local9 = (Class6_Sub2_Sub10) this.aClass286_13.method7242(); local9 != null; local9 = (Class6_Sub2_Sub10) this.aClass286_13.method7241()) {
			if (local9.method6997()) {
				if (local9.method6996() == null) {
					local9.method9043();
					local9.method8754();
					this.anInt10297 += local9.anInt8104;
				}
			} else if ((long) 5 < ++local9.aLong272) {
				@Pc(31) Class6_Sub2_Sub10 local31 = Static45.aClass111_1.method3200(local9);
				this.aClass128_49.method3551(local9.aLong278, local31);
				Static14.method280(local31, local9);
				local9.method9043();
				local9.method8754();
			}
		}
	}
}
