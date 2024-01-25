import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class345 {

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "Lclient!uf;")
	private final Class326 aClass326_54 = new Class326(16);

	@OriginalMember(owner = "client!vm", name = "g", descriptor = "Lclient!ga;")
	private final Class111 aClass111_122;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lclient!nq;ILclient!ga;)V")
	public Class345(@OriginalArg(0) Class230 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class111 arg2) {
		this.aClass111_122 = arg2;
		this.aClass111_122.method2442(29);
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)V")
	public void method7548() {
		@Pc(11) Class326 local11 = this.aClass326_54;
		synchronized (this.aClass326_54) {
			this.aClass326_54.method7234();
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V")
	public void method7549() {
		@Pc(10) Class326 local10 = this.aClass326_54;
		synchronized (this.aClass326_54) {
			this.aClass326_54.method7230();
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILclient!pu;IIII)Lclient!nda;")
	public Class224 method7550(@OriginalArg(0) int arg0, @OriginalArg(1) Class263 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class5[] local7 = null;
		@Pc(19) Class246 local19 = this.method7552(arg3);
		if (local19.anIntArray461 != null) {
			local7 = new Class5[local19.anIntArray461.length];
			for (@Pc(29) int local29 = 0; local29 < local7.length; local29++) {
				@Pc(39) Class316 local39 = arg1.method5842(local19.anIntArray461[local29]);
				local7[local29] = new Class5(local39.anInt8506, local39.anInt8511, local39.anInt8514, local39.anInt8512, local39.anInt8509, local39.anInt8513, local39.anInt8507, local39.aBoolean627);
			}
		}
		return new Class224(local19.anInt6781, local7, local19.anInt6780, arg0, arg2, arg4);
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(BI)V")
	public void method7551() {
		@Pc(6) Class326 local6 = this.aClass326_54;
		synchronized (this.aClass326_54) {
			this.aClass326_54.method7241(5);
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IB)Lclient!or;")
	private Class246 method7552(@OriginalArg(0) int arg0) {
		@Pc(6) Class326 local6 = this.aClass326_54;
		@Pc(16) Class246 local16;
		synchronized (this.aClass326_54) {
			local16 = (Class246) this.aClass326_54.method7238((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class111 local37 = this.aClass111_122;
		@Pc(46) byte[] local46;
		synchronized (this.aClass111_122) {
			local46 = this.aClass111_122.method2441(arg0, 29);
		}
		local16 = new Class246();
		if (local46 != null) {
			local16.method5578(new Class1_Sub20(local46));
		}
		@Pc(68) Class326 local68 = this.aClass326_54;
		synchronized (this.aClass326_54) {
			this.aClass326_54.method7236(local16, (long) arg0);
			return local16;
		}
	}
}
