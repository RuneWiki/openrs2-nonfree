import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class240 {

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "Lclient!ad;")
	private final Class6 aClass6_50 = new Class6(64);

	@OriginalMember(owner = "client!oj", name = "i", descriptor = "Lclient!ad;")
	private final Class6 aClass6_51 = new Class6(100);

	@OriginalMember(owner = "client!oj", name = "f", descriptor = "Lclient!tf;")
	private final Class322 aClass322_119;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lclient!qh;ILclient!tf;Lclient!tf;Lclient!tf;)V")
	public Class240(@OriginalArg(0) Class274 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class322 arg2, @OriginalArg(3) Class322 arg3, @OriginalArg(4) Class322 arg4) {
		this.aClass322_119 = arg2;
		if (this.aClass322_119 != null) {
			@Pc(26) int local26 = this.aClass322_119.method6825() - 1;
			this.aClass322_119.method6831(local26);
		}
		Static24.method429(arg4, arg3);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(BI)V")
	public void method5678() {
		@Pc(10) Class6 local10 = this.aClass6_50;
		synchronized (this.aClass6_50) {
			this.aClass6_50.method97(5);
		}
		local10 = this.aClass6_51;
		synchronized (this.aClass6_51) {
			this.aClass6_51.method97(5);
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IB)Lclient!ej;")
	public Class3_Sub7_Sub6 method5679(@OriginalArg(0) int arg0) {
		@Pc(6) Class6 local6 = this.aClass6_51;
		synchronized (this.aClass6_51) {
			@Pc(16) Class3_Sub7_Sub6 local16 = (Class3_Sub7_Sub6) this.aClass6_51.method92((long) arg0);
			if (local16 == null) {
				local16 = new Class3_Sub7_Sub6(arg0);
				this.aClass6_51.method106((long) arg0, local16);
			}
			return local16.method2521() ? local16 : null;
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)Lclient!lb;")
	public Class185 method5680(@OriginalArg(0) int arg0) {
		@Pc(6) Class6 local6 = this.aClass6_50;
		@Pc(16) Class185 local16;
		synchronized (this.aClass6_50) {
			local16 = (Class185) this.aClass6_50.method92((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class322 local35 = this.aClass322_119;
		@Pc(48) byte[] local48;
		synchronized (this.aClass322_119) {
			local48 = this.aClass322_119.method6802(Static436.method6096(arg0), Static181.method3120(arg0));
		}
		local16 = new Class185();
		local16.aClass240_3 = this;
		local16.anInt4973 = arg0;
		if (local48 != null) {
			local16.method4375(new Class3_Sub11(local48));
		}
		local16.method4377();
		@Pc(79) Class6 local79 = this.aClass6_50;
		synchronized (this.aClass6_50) {
			this.aClass6_50.method106((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V")
	public void method5681() {
		@Pc(2) Class6 local2 = this.aClass6_50;
		synchronized (this.aClass6_50) {
			this.aClass6_50.method94();
		}
		local2 = this.aClass6_51;
		synchronized (this.aClass6_51) {
			this.aClass6_51.method94();
		}
	}

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)V")
	public void method5682() {
		@Pc(2) Class6 local2 = this.aClass6_50;
		synchronized (this.aClass6_50) {
			this.aClass6_50.method102();
		}
		local2 = this.aClass6_51;
		synchronized (this.aClass6_51) {
			this.aClass6_51.method102();
		}
	}
}
