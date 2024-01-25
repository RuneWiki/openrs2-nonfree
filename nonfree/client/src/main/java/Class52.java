import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class52 {

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "Lclient!co;")
	private final Class41 aClass41_18 = new Class41(16);

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "Lclient!g;")
	private final Class83 aClass83_33;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lclient!ci;ILclient!g;)V")
	public Class52(@OriginalArg(0) Class38 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class83 arg2) {
		this.aClass83_33 = arg2;
		this.aClass83_33.method1955(29);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IB)V")
	public void method1201() {
		@Pc(6) Class41 local6 = this.aClass41_18;
		synchronized (this.aClass41_18) {
			this.aClass41_18.method826(5);
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(BI)Lclient!cc;")
	private Class33 method1202(@OriginalArg(1) int arg0) {
		@Pc(6) Class41 local6 = this.aClass41_18;
		@Pc(16) Class33 local16;
		synchronized (this.aClass41_18) {
			local16 = (Class33) this.aClass41_18.method823((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(40) byte[] local40 = this.aClass83_33.method1968(arg0, 29);
		local16 = new Class33();
		if (local40 != null) {
			local16.method583(new Class2_Sub24(local40));
		}
		@Pc(56) Class41 local56 = this.aClass41_18;
		synchronized (this.aClass41_18) {
			this.aClass41_18.method832((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V")
	public void method1204() {
		@Pc(2) Class41 local2 = this.aClass41_18;
		synchronized (this.aClass41_18) {
			this.aClass41_18.method829();
		}
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)V")
	public void method1205() {
		@Pc(2) Class41 local2 = this.aClass41_18;
		synchronized (this.aClass41_18) {
			this.aClass41_18.method825();
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IILclient!nk;IIB)Lclient!dp;")
	public Class58 method1206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class162 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) Class143[] local7 = null;
		@Pc(20) Class33 local20 = this.method1202(arg0);
		if (local20.anIntArray61 != null) {
			local7 = new Class143[local20.anIntArray61.length];
			for (@Pc(30) int local30 = 0; local30 < local7.length; local30++) {
				@Pc(40) Class63 local40 = arg2.method4134(local20.anIntArray61[local30]);
				local7[local30] = new Class143(local40.anInt1788, local40.anInt1786, local40.anInt1790, local40.anInt1796, local40.anInt1792, local40.anInt1791, local40.anInt1794, local40.aBoolean136);
			}
		}
		return new Class58(local20.anInt731, local7, local20.anInt725, arg1, arg3, arg4);
	}
}
