import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jba")
public final class Class172 {

	@OriginalMember(owner = "client!jba", name = "q", descriptor = "Lclient!nc;")
	private final Class243 aClass243_7 = new Class243();

	@OriginalMember(owner = "client!jba", name = "n", descriptor = "I")
	private final int anInt4667;

	@OriginalMember(owner = "client!jba", name = "j", descriptor = "I")
	private int anInt4663;

	@OriginalMember(owner = "client!jba", name = "f", descriptor = "Lclient!tca;")
	private final Class333 aClass333_16;

	@OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(I)V")
	public Class172(@OriginalArg(0) int arg0) {
		this.anInt4667 = arg0;
		this.anInt4663 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; local16 + local16 < arg0; local16 += local16) {
		}
		this.aClass333_16 = new Class333(local16);
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(I)V")
	public void method3997() {
		for (@Pc(13) Class3_Sub5_Sub1 local13 = (Class3_Sub5_Sub1) this.aClass243_7.method5459(); local13 != null; local13 = (Class3_Sub5_Sub1) this.aClass243_7.method5453()) {
			if (local13.method9018()) {
				local13.method9034();
				local13.method9014();
				this.anInt4663 += local13.anInt10932;
			}
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(II)V")
	public void method3999() {
		if (Static621.aClass86_1 == null) {
			return;
		}
		for (@Pc(13) Class3_Sub5_Sub1 local13 = (Class3_Sub5_Sub1) this.aClass243_7.method5459(); local13 != null; local13 = (Class3_Sub5_Sub1) this.aClass243_7.method5453()) {
			if (local13.method9018()) {
				if (local13.method9015() == null) {
					local13.method9034();
					local13.method9014();
					this.anInt4663 += local13.anInt10932;
				}
			} else if ((long) 5 < ++local13.aLong312) {
				@Pc(54) Class3_Sub5_Sub1 local54 = Static621.aClass86_1.method1776(local13);
				this.aClass333_16.method7488(local13.aLong313, local54);
				Static511.method6670(local13, local54);
				local13.method9034();
				local13.method9014();
			}
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Ljava/lang/Object;BLclient!st;)V")
	public void method4001(@OriginalArg(0) Object arg0, @OriginalArg(2) Interface24 arg1) {
		this.method4002(arg1, arg0);
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lclient!st;Ljava/lang/Object;II)V")
	private void method4002(@OriginalArg(0) Interface24 arg0, @OriginalArg(1) Object arg1) {
		if (this.anInt4667 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method4009(arg0);
		this.anInt4663--;
		while (this.anInt4663 < 0) {
			@Pc(32) Class3_Sub5_Sub1 local32 = (Class3_Sub5_Sub1) this.aClass243_7.method5462();
			this.method4007(local32);
		}
		@Pc(49) Class3_Sub5_Sub1_Sub1 local49 = new Class3_Sub5_Sub1_Sub1(arg0, arg1, 1);
		this.aClass333_16.method7488(arg0.method6325(), local49);
		this.aClass243_7.method5457(local49);
		local49.aLong312 = (long) 0;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Z)V")
	public void method4003() {
		this.aClass243_7.method5460();
		this.aClass333_16.method7485();
		this.anInt4663 = this.anInt4667;
	}

	@OriginalMember(owner = "client!jba", name = "c", descriptor = "(I)I")
	public int method4004() {
		return this.anInt4663;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(ILclient!st;)Ljava/lang/Object;")
	public Object method4005(@OriginalArg(1) Interface24 arg0) {
		@Pc(9) long local9 = arg0.method6325();
		for (@Pc(16) Class3_Sub5_Sub1 local16 = (Class3_Sub5_Sub1) this.aClass333_16.method7489(local9); local16 != null; local16 = (Class3_Sub5_Sub1) this.aClass333_16.method7484()) {
			if (local16.anInterface24_3.method6326(arg0)) {
				@Pc(32) Object local32 = local16.method9015();
				if (local32 != null) {
					if (local16.method9018()) {
						@Pc(73) Class3_Sub5_Sub1_Sub1 local73 = new Class3_Sub5_Sub1_Sub1(arg0, local32, local16.anInt10932);
						this.aClass333_16.method7488(local16.aLong313, local73);
						this.aClass243_7.method5457(local73);
						local73.aLong312 = 0L;
						local16.method9034();
						local16.method9014();
					} else {
						this.aClass243_7.method5457(local16);
						local16.aLong312 = 0L;
					}
					return local32;
				}
				local16.method9034();
				local16.method9014();
				this.anInt4663 += local16.anInt10932;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lclient!qo;I)V")
	private void method4007(@OriginalArg(0) Class3_Sub5_Sub1 arg0) {
		if (arg0 != null) {
			arg0.method9034();
			arg0.method9014();
			this.anInt4663 += arg0.anInt10932;
		}
	}

	@OriginalMember(owner = "client!jba", name = "d", descriptor = "(I)I")
	public int method4008() {
		return this.anInt4667;
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(ILclient!st;)V")
	private void method4009(@OriginalArg(1) Interface24 arg0) {
		@Pc(9) long local9 = arg0.method6325();
		for (@Pc(16) Class3_Sub5_Sub1 local16 = (Class3_Sub5_Sub1) this.aClass333_16.method7489(local9); local16 != null; local16 = (Class3_Sub5_Sub1) this.aClass333_16.method7484()) {
			if (local16.anInterface24_3.method6326(arg0)) {
				this.method4007(local16);
				break;
			}
		}
	}
}
