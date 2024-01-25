import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class108 {

	@OriginalMember(owner = "client!gi", name = "l", descriptor = "Lclient!wg;")
	private final Class313 aClass313_22 = new Class313(64);

	@OriginalMember(owner = "client!gi", name = "g", descriptor = "Lclient!kr;")
	private final Class171 aClass171_66;

	@OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
	public final int anInt2927;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lclient!g;ILclient!kr;)V")
	public Class108(@OriginalArg(0) Class101 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_66 = arg2;
		if (this.aClass171_66 == null) {
			this.anInt2927 = 0;
		} else {
			this.anInt2927 = this.aClass171_66.method4349(16);
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V")
	public void method2493() {
		@Pc(13) Class313 local13 = this.aClass313_22;
		synchronized (this.aClass313_22) {
			this.aClass313_22.method7400();
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZI)Lclient!qe;")
	public Class245 method2494(@OriginalArg(1) int arg0) {
		@Pc(6) Class313 local6 = this.aClass313_22;
		@Pc(16) Class245 local16;
		synchronized (this.aClass313_22) {
			local16 = (Class245) this.aClass313_22.method7406((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class171 local35 = this.aClass171_66;
		@Pc(44) byte[] local44;
		synchronized (this.aClass171_66) {
			local44 = this.aClass171_66.method4339(16, arg0);
		}
		local16 = new Class245();
		if (local44 != null) {
			local16.method5881(new Class1_Sub6(local44));
		}
		@Pc(66) Class313 local66 = this.aClass313_22;
		synchronized (this.aClass313_22) {
			this.aClass313_22.method7399((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)V")
	public void method2495() {
		@Pc(12) Class313 local12 = this.aClass313_22;
		synchronized (this.aClass313_22) {
			this.aClass313_22.method7398();
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)V")
	public void method2497() {
		@Pc(2) Class313 local2 = this.aClass313_22;
		synchronized (this.aClass313_22) {
			this.aClass313_22.method7403(5);
		}
	}
}
