import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class15 {

	@OriginalMember(owner = "client!al", name = "b", descriptor = "Lclient!pca;")
	private final Class245 aClass245_8 = new Class245(16);

	@OriginalMember(owner = "client!al", name = "d", descriptor = "Lclient!jo;")
	private final Class168 aClass168_9;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!jda;ILclient!jo;)V")
	public Class15(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class168 arg2) {
		this.aClass168_9 = arg2;
		this.aClass168_9.method4443(29);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V")
	public void method638() {
		@Pc(2) Class245 local2 = this.aClass245_8;
		synchronized (this.aClass245_8) {
			this.aClass245_8.method6079();
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(BI)V")
	public void method639() {
		@Pc(12) Class245 local12 = this.aClass245_8;
		synchronized (this.aClass245_8) {
			this.aClass245_8.method6083(5);
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(II)Lclient!pc;")
	private Class244 method640(@OriginalArg(1) int arg0) {
		@Pc(6) Class245 local6 = this.aClass245_8;
		@Pc(16) Class244 local16;
		synchronized (this.aClass245_8) {
			local16 = (Class244) this.aClass245_8.method6082((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class168 local29 = this.aClass168_9;
		@Pc(40) byte[] local40;
		synchronized (this.aClass168_9) {
			local40 = this.aClass168_9.method4435(arg0, 29);
		}
		local16 = new Class244();
		if (local40 != null) {
			local16.method6073(new Class6_Sub26(local40));
		}
		@Pc(67) Class245 local67 = this.aClass245_8;
		synchronized (this.aClass245_8) {
			this.aClass245_8.method6075(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ILclient!gh;IBII)Lclient!bn;")
	public Class38 method642(@OriginalArg(0) int arg0, @OriginalArg(1) Class115 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class233[] local7 = null;
		@Pc(12) Class244 local12 = this.method640(arg3);
		if (local12.anIntArray507 != null) {
			local7 = new Class233[local12.anIntArray507.length];
			for (@Pc(22) int local22 = 0; local22 < local7.length; local22++) {
				@Pc(32) Class160 local32 = arg1.method3458(local12.anIntArray507[local22]);
				local7[local22] = new Class233(local32.anInt4808, local32.anInt4805, local32.anInt4814, local32.anInt4810, local32.anInt4812, local32.anInt4807, local32.anInt4809, local32.aBoolean374);
			}
		}
		return new Class38(local12.anInt7235, local7, local12.anInt7238, arg0, arg4, arg2);
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(Z)V")
	public void method643() {
		@Pc(6) Class245 local6 = this.aClass245_8;
		synchronized (this.aClass245_8) {
			this.aClass245_8.method6076();
		}
	}
}
