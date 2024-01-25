import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2 {

	@OriginalMember(owner = "client!aa", name = "l", descriptor = "Lclient!ad;")
	private final Class5 aClass5_1 = new Class5(16);

	@OriginalMember(owner = "client!aa", name = "k", descriptor = "Lclient!dn;")
	private final Class56 aClass56_1;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lclient!gt;ILclient!dn;)V")
	public Class2(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class56 arg2) {
		this.aClass56_1 = arg2;
		this.aClass56_1.method1373(29);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)V")
	public void method62() {
		@Pc(10) Class5 local10 = this.aClass5_1;
		synchronized (this.aClass5_1) {
			this.aClass5_1.method106(5);
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
	public void method63() {
		@Pc(2) Class5 local2 = this.aClass5_1;
		synchronized (this.aClass5_1) {
			this.aClass5_1.method110();
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!so;IIIII)Lclient!bv;")
	public Class29 method65(@OriginalArg(0) Class211 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) Class144[] local9 = null;
		@Pc(14) Class255 local14 = this.method66(arg3);
		if (local14.anIntArray559 != null) {
			local9 = new Class144[local14.anIntArray559.length];
			for (@Pc(24) int local24 = 0; local24 < local9.length; local24++) {
				@Pc(33) Class93 local33 = arg0.method5152(local14.anIntArray559[local24]);
				local9[local24] = new Class144(local33.anInt3276, local33.anInt3274, local33.anInt3277, local33.anInt3272, local33.anInt3269, local33.anInt3275, local33.anInt3270, local33.aBoolean251);
			}
		}
		return new Class29(local14.anInt7362, local9, local14.anInt7365, arg4, arg2, arg1);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BI)Lclient!vr;")
	private Class255 method66(@OriginalArg(1) int arg0) {
		@Pc(6) Class5 local6 = this.aClass5_1;
		@Pc(16) Class255 local16;
		synchronized (this.aClass5_1) {
			local16 = (Class255) this.aClass5_1.method104((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(38) byte[] local38 = this.aClass56_1.method1384(29, arg0);
		local16 = new Class255();
		if (local38 != null) {
			local16.method5751(new Class3_Sub2(local38));
		}
		@Pc(54) Class5 local54 = this.aClass5_1;
		synchronized (this.aClass5_1) {
			this.aClass5_1.method114((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V")
	public void method68() {
		@Pc(2) Class5 local2 = this.aClass5_1;
		synchronized (this.aClass5_1) {
			this.aClass5_1.method116();
		}
	}
}
