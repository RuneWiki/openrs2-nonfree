import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class279 {

	@OriginalMember(owner = "client!tc", name = "n", descriptor = "Lclient!wg;")
	private final Class313 aClass313_60 = new Class313(64);

	@OriginalMember(owner = "client!tc", name = "q", descriptor = "I")
	public int anInt7798 = 0;

	@OriginalMember(owner = "client!tc", name = "m", descriptor = "Lclient!kr;")
	private final Class171 aClass171_143;

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
	public final int anInt7789;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lclient!g;ILclient!kr;)V")
	public Class279(@OriginalArg(0) Class101 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_143 = arg2;
		this.anInt7789 = this.aClass171_143.method4349(4);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V")
	public void method6481() {
		@Pc(2) Class313 local2 = this.aClass313_60;
		synchronized (this.aClass313_60) {
			this.aClass313_60.method7398();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)V")
	public void method6483() {
		@Pc(7) Class313 local7 = this.aClass313_60;
		synchronized (this.aClass313_60) {
			this.aClass313_60.method7400();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZI)Lclient!jg;")
	public Class151 method6485(@OriginalArg(1) int arg0) {
		@Pc(6) Class313 local6 = this.aClass313_60;
		@Pc(16) Class151 local16;
		synchronized (this.aClass313_60) {
			local16 = (Class151) this.aClass313_60.method7406((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class171 local34 = this.aClass171_143;
		@Pc(43) byte[] local43;
		synchronized (this.aClass171_143) {
			local43 = this.aClass171_143.method4339(4, arg0);
		}
		local16 = new Class151();
		local16.aClass279_5 = this;
		local16.anInt4472 = arg0;
		if (local43 != null) {
			local16.method3898(new Class1_Sub6(local43));
		}
		local16.method3897();
		@Pc(74) Class313 local74 = this.aClass313_60;
		synchronized (this.aClass313_60) {
			this.aClass313_60.method7399((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)V")
	public void method6486() {
		@Pc(6) Class313 local6 = this.aClass313_60;
		synchronized (this.aClass313_60) {
			this.aClass313_60.method7403(5);
		}
	}
}
