import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class116 {

	@OriginalMember(owner = "client!jc", name = "s", descriptor = "I")
	public int anInt3259;

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "Lclient!co;")
	private final Class41 aClass41_41 = new Class41(64);

	@OriginalMember(owner = "client!jc", name = "p", descriptor = "Lclient!co;")
	public final Class41 aClass41_42 = new Class41(30);

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "Lclient!g;")
	private final Class83 aClass83_63;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "Lclient!g;")
	public final Class83 aClass83_64;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lclient!ci;ILclient!g;Lclient!g;)V")
	public Class116(@OriginalArg(0) Class38 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class83 arg2, @OriginalArg(3) Class83 arg3) {
		this.aClass83_63 = arg2;
		this.aClass83_64 = arg3;
		@Pc(26) int local26 = this.aClass83_63.method1956() - 1;
		this.aClass83_63.method1955(local26);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
	public void method2784() {
		@Pc(6) Class41 local6 = this.aClass41_41;
		synchronized (this.aClass41_41) {
			this.aClass41_41.method829();
		}
		local6 = this.aClass41_42;
		synchronized (this.aClass41_42) {
			this.aClass41_42.method829();
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
	public void method2786() {
		@Pc(2) Class41 local2 = this.aClass41_41;
		synchronized (this.aClass41_41) {
			this.aClass41_41.method825();
		}
		local2 = this.aClass41_42;
		synchronized (this.aClass41_42) {
			this.aClass41_42.method825();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)V")
	public void method2788(@OriginalArg(0) int arg0) {
		this.anInt3259 = arg0;
		@Pc(17) Class41 local17 = this.aClass41_42;
		synchronized (this.aClass41_42) {
			this.aClass41_42.method825();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZI)V")
	public void method2789() {
		@Pc(6) Class41 local6 = this.aClass41_41;
		synchronized (this.aClass41_41) {
			this.aClass41_41.method826(5);
		}
		local6 = this.aClass41_42;
		synchronized (this.aClass41_42) {
			this.aClass41_42.method826(5);
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(II)Lclient!pm;")
	public Class182 method2791(@OriginalArg(0) int arg0) {
		@Pc(6) Class41 local6 = this.aClass41_41;
		@Pc(16) Class182 local16;
		synchronized (this.aClass41_41) {
			local16 = (Class182) this.aClass41_41.method823((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(43) byte[] local43 = this.aClass83_63.method1968(Static69.method1261(arg0), Static81.method1387(arg0));
		local16 = new Class182();
		local16.anInt5102 = arg0;
		local16.aClass116_2 = this;
		if (local43 != null) {
			local16.method4566(new Class2_Sub24(local43));
		}
		@Pc(65) Class41 local65 = this.aClass41_41;
		synchronized (this.aClass41_41) {
			this.aClass41_41.method832((long) arg0, local16);
			return local16;
		}
	}
}
