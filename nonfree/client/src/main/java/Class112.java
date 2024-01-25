import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fia")
public final class Class112 {

	@OriginalMember(owner = "client!fia", name = "l", descriptor = "Lclient!dp;")
	private final Class82 aClass82_3 = new Class82();

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "I")
	private final int anInt3405;

	@OriginalMember(owner = "client!fia", name = "q", descriptor = "I")
	private int anInt3407;

	@OriginalMember(owner = "client!fia", name = "b", descriptor = "Lclient!dfa;")
	private final Class74 aClass74_17;

	@OriginalMember(owner = "client!fia", name = "<init>", descriptor = "(I)V")
	public Class112(@OriginalArg(0) int arg0) {
		this.anInt3405 = arg0;
		this.anInt3407 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass74_17 = new Class74(local16);
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(Lclient!rc;Ljava/lang/Object;B)V")
	public void method3204(@OriginalArg(0) Interface22 arg0, @OriginalArg(1) Object arg1) {
		this.method3212(arg0, arg1);
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(IB)V")
	public void method3205() {
		if (Static439.aClass57_3 == null) {
			return;
		}
		for (@Pc(20) Class6_Sub2_Sub7 local20 = (Class6_Sub2_Sub7) this.aClass82_3.method2071(); local20 != null; local20 = (Class6_Sub2_Sub7) this.aClass82_3.method2078()) {
			if (local20.method7671()) {
				if (local20.method7670() == null) {
					local20.method9051();
					local20.method8464();
					this.anInt3407 += local20.anInt8757;
				}
			} else if (++local20.aLong317 > (long) 5) {
				@Pc(46) Class6_Sub2_Sub7 local46 = Static439.aClass57_3.method3134(local20);
				this.aClass74_17.method1399(local46, local20.aLong346);
				Static548.method7755(local46, local20);
				local20.method9051();
				local20.method8464();
			}
		}
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(BLclient!g;)V")
	private void method3206(@OriginalArg(1) Class6_Sub2_Sub7 arg0) {
		if (arg0 != null) {
			arg0.method9051();
			arg0.method8464();
			this.anInt3407 += arg0.anInt8757;
		}
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(Lclient!rc;I)V")
	private void method3208(@OriginalArg(0) Interface22 arg0) {
		@Pc(9) long local9 = arg0.method7393();
		for (@Pc(24) Class6_Sub2_Sub7 local24 = (Class6_Sub2_Sub7) this.aClass74_17.method1401(local9); local24 != null; local24 = (Class6_Sub2_Sub7) this.aClass74_17.method1407()) {
			if (local24.anInterface22_3.method7392(arg0)) {
				this.method3206(local24);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(I)V")
	public void method3209() {
		for (@Pc(14) Class6_Sub2_Sub7 local14 = (Class6_Sub2_Sub7) this.aClass82_3.method2071(); local14 != null; local14 = (Class6_Sub2_Sub7) this.aClass82_3.method2078()) {
			if (local14.method7671()) {
				local14.method9051();
				local14.method8464();
				this.anInt3407 += local14.anInt8757;
			}
		}
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(B)V")
	public void method3210() {
		this.aClass82_3.method2075();
		this.aClass74_17.method1398();
		this.anInt3407 = this.anInt3405;
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(IILclient!rc;Ljava/lang/Object;)V")
	private void method3212(@OriginalArg(2) Interface22 arg0, @OriginalArg(3) Object arg1) {
		if (this.anInt3405 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method3208(arg0);
		this.anInt3407--;
		while (this.anInt3407 < 0) {
			@Pc(39) Class6_Sub2_Sub7 local39 = (Class6_Sub2_Sub7) this.aClass82_3.method2077();
			this.method3206(local39);
		}
		@Pc(56) Class6_Sub2_Sub7_Sub1 local56 = new Class6_Sub2_Sub7_Sub1(arg0, arg1, 1);
		this.aClass74_17.method1399(local56, arg0.method7393());
		this.aClass82_3.method2076(local56);
		local56.aLong317 = (long) 0;
	}

	@OriginalMember(owner = "client!fia", name = "b", descriptor = "(I)I")
	public int method3213() {
		return this.anInt3407;
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(BLclient!rc;)Ljava/lang/Object;")
	public Object method3214(@OriginalArg(1) Interface22 arg0) {
		@Pc(9) long local9 = arg0.method7393();
		for (@Pc(16) Class6_Sub2_Sub7 local16 = (Class6_Sub2_Sub7) this.aClass74_17.method1401(local9); local16 != null; local16 = (Class6_Sub2_Sub7) this.aClass74_17.method1407()) {
			if (local16.anInterface22_3.method7392(arg0)) {
				@Pc(38) Object local38 = local16.method7670();
				if (local38 != null) {
					if (local16.method7671()) {
						@Pc(71) Class6_Sub2_Sub7_Sub1 local71 = new Class6_Sub2_Sub7_Sub1(arg0, local38, local16.anInt8757);
						this.aClass74_17.method1399(local71, local16.aLong346);
						this.aClass82_3.method2076(local71);
						local71.aLong317 = 0L;
						local16.method9051();
						local16.method8464();
					} else {
						this.aClass82_3.method2076(local16);
						local16.aLong317 = 0L;
					}
					return local38;
				}
				local16.method9051();
				local16.method8464();
				this.anInt3407 += local16.anInt8757;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fia", name = "d", descriptor = "(I)I")
	public int method3215() {
		return this.anInt3405;
	}
}
