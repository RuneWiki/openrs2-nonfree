import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pba")
public final class Class285 {

	@OriginalMember(owner = "client!pba", name = "c", descriptor = "Lclient!gw;")
	private final Class147 aClass147_6 = new Class147();

	@OriginalMember(owner = "client!pba", name = "g", descriptor = "I")
	private int anInt7656;

	@OriginalMember(owner = "client!pba", name = "n", descriptor = "I")
	private final int anInt7665;

	@OriginalMember(owner = "client!pba", name = "k", descriptor = "Lclient!qn;")
	private final Class313 aClass313_39;

	@OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(I)V")
	public Class285(@OriginalArg(0) int arg0) {
		this.anInt7656 = arg0;
		this.anInt7665 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; local16 + local16 < arg0; local16 += local16) {
		}
		this.aClass313_39 = new Class313(local16);
	}

	@OriginalMember(owner = "client!pba", name = "d", descriptor = "(I)I")
	public int method6605() {
		return this.anInt7656;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(ILclient!qaa;)V")
	private void method6606(@OriginalArg(1) Interface17 arg0) {
		@Pc(17) long local17 = arg0.method3442();
		for (@Pc(24) Class3_Sub7_Sub16 local24 = (Class3_Sub7_Sub16) this.aClass313_39.method7104(local17); local24 != null; local24 = (Class3_Sub7_Sub16) this.aClass313_39.method7106()) {
			if (local24.anInterface17_3.method3443(arg0)) {
				this.method6610(local24);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pba", name = "b", descriptor = "(ILclient!qaa;)Ljava/lang/Object;")
	public Object method6607(@OriginalArg(1) Interface17 arg0) {
		@Pc(9) long local9 = arg0.method3442();
		for (@Pc(28) Class3_Sub7_Sub16 local28 = (Class3_Sub7_Sub16) this.aClass313_39.method7104(local9); local28 != null; local28 = (Class3_Sub7_Sub16) this.aClass313_39.method7106()) {
			if (local28.anInterface17_3.method3443(arg0)) {
				@Pc(42) Object local42 = local28.method6647();
				if (local42 != null) {
					if (local28.method6645()) {
						@Pc(77) Class3_Sub7_Sub16_Sub2 local77 = new Class3_Sub7_Sub16_Sub2(arg0, local42, local28.anInt7701);
						this.aClass313_39.method7107(local28.aLong345, local77);
						this.aClass147_6.method3335(local77);
						local77.aLong336 = 0L;
						local28.method9596();
						local28.method9251();
					} else {
						this.aClass147_6.method3335(local28);
						local28.aLong336 = 0L;
					}
					return local42;
				}
				local28.method9596();
				local28.method9251();
				this.anInt7656 += local28.anInt7701;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(Ljava/lang/Object;ILclient!qaa;I)V")
	private void method6609(@OriginalArg(0) Object arg0, @OriginalArg(2) Interface17 arg1) {
		if (this.anInt7665 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method6606(arg1);
		this.anInt7656--;
		while (this.anInt7656 < 0) {
			@Pc(39) Class3_Sub7_Sub16 local39 = (Class3_Sub7_Sub16) this.aClass147_6.method3333();
			this.method6610(local39);
		}
		@Pc(53) Class3_Sub7_Sub16_Sub2 local53 = new Class3_Sub7_Sub16_Sub2(arg1, arg0, 1);
		if (-32022 == -32022) {
			this.aClass313_39.method7107(arg1.method3442(), local53);
			this.aClass147_6.method3335(local53);
			local53.aLong336 = 0L;
		}
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(Lclient!ps;B)V")
	private void method6610(@OriginalArg(0) Class3_Sub7_Sub16 arg0) {
		if (arg0 != null) {
			arg0.method9596();
			arg0.method9251();
			this.anInt7656 += arg0.anInt7701;
		}
	}

	@OriginalMember(owner = "client!pba", name = "b", descriptor = "(I)I")
	public int method6611() {
		return this.anInt7665;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(ILjava/lang/Object;Lclient!qaa;)V")
	public void method6612(@OriginalArg(1) Object arg0, @OriginalArg(2) Interface17 arg1) {
		this.method6609(arg0, arg1);
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(I)V")
	public void method6613() {
		this.aClass147_6.method3331();
		this.aClass313_39.method7101();
		this.anInt7656 = this.anInt7665;
	}

	@OriginalMember(owner = "client!pba", name = "c", descriptor = "(I)V")
	public void method6614() {
		for (@Pc(7) Class3_Sub7_Sub16 local7 = (Class3_Sub7_Sub16) this.aClass147_6.method3334(); local7 != null; local7 = (Class3_Sub7_Sub16) this.aClass147_6.method3332()) {
			if (local7.method6645()) {
				local7.method9596();
				local7.method9251();
				this.anInt7656 += local7.anInt7701;
			}
		}
		if (41 <= 23) {
			Static487.method6615((Interface4) null, (Canvas) null, 15, 43, 31);
		}
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(II)V")
	public void method6616() {
		if (Static688.aClass137_1 == null) {
			return;
		}
		for (@Pc(13) Class3_Sub7_Sub16 local13 = (Class3_Sub7_Sub16) this.aClass147_6.method3334(); local13 != null; local13 = (Class3_Sub7_Sub16) this.aClass147_6.method3332()) {
			if (local13.method6645()) {
				if (local13.method6647() == null) {
					local13.method9596();
					local13.method9251();
					this.anInt7656 += local13.anInt7701;
				}
			} else if (++local13.aLong336 > (long) 5) {
				@Pc(66) Class3_Sub7_Sub16 local66 = Static688.aClass137_1.method3541(local13);
				this.aClass313_39.method7107(local13.aLong345, local66);
				Static461.method6257(local13, local66);
				local13.method9596();
				local13.method9251();
			}
		}
	}
}
