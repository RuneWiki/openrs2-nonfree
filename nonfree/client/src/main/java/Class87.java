import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class87 {

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "Lclient!r;")
	private final Class1_Sub2 aClass1_Sub2_58 = new Class1_Sub2();

	@OriginalMember(owner = "client!uc", name = "t", descriptor = "Lclient!ea;")
	private final Class22 aClass22_2 = new Class22();

	@OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
	private final int anInt4079;

	@OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
	private int anInt4078;

	@OriginalMember(owner = "client!uc", name = "s", descriptor = "Lclient!wh;")
	private final Class99 aClass99_12;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(I)V")
	public Class87(@OriginalArg(0) int arg0) {
		this.anInt4079 = arg0;
		this.anInt4078 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass99_12 = new Class99(local19);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IJ)V")
	public void method3058(@OriginalArg(1) long arg0) {
		@Pc(15) Class1_Sub2 local15 = (Class1_Sub2) this.aClass99_12.method3292(arg0);
		if (local15 != null) {
			local15.method3295();
			local15.method3229();
			this.anInt4078++;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
	public void method3061() {
		while (true) {
			@Pc(16) Class1_Sub2 local16 = this.aClass22_2.method723();
			if (local16 == null) {
				this.anInt4078 = this.anInt4079;
				return;
			}
			local16.method3295();
			local16.method3229();
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BJ)Lclient!r;")
	public Class1_Sub2 method3062(@OriginalArg(1) long arg0) {
		@Pc(10) Class1_Sub2 local10 = (Class1_Sub2) this.aClass99_12.method3292(arg0);
		if (local10 != null) {
			this.aClass22_2.method725(local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)Lclient!ji;")
	public Class1 method3064() {
		return this.aClass99_12.method3289();
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(B)Lclient!ji;")
	public Class1 method3066() {
		return this.aClass99_12.method3288();
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!r;IJ)V")
	public void method3068(@OriginalArg(0) Class1_Sub2 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt4078 == 0) {
			@Pc(11) Class1_Sub2 local11 = this.aClass22_2.method723();
			local11.method3295();
			local11.method3229();
			if (this.aClass1_Sub2_58 == local11) {
				local11 = this.aClass22_2.method723();
				local11.method3295();
				local11.method3229();
			}
		} else {
			this.anInt4078--;
		}
		this.aClass99_12.method3290(arg0, arg1);
		this.aClass22_2.method725(arg0);
	}
}
