import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public final class Class125 {

	@OriginalMember(owner = "client!hp", name = "h", descriptor = "I")
	private final int anInt4248;

	@OriginalMember(owner = "client!hp", name = "i", descriptor = "Lclient!tf;")
	private final Class279 aClass279_1;

	@OriginalMember(owner = "client!hp", name = "p", descriptor = "Lclient!sd;")
	private final Class267 aClass267_17;

	@OriginalMember(owner = "client!hp", name = "w", descriptor = "I")
	private int anInt4261;

	static {
		new Class67(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
	}

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(I)V")
	public Class125(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(II)V")
	private Class125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass279_1 = new Class279();
		this.anInt4248 = arg0;
		this.anInt4261 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14 && arg1 > local14; local14 += local14) {
		}
		this.aClass267_17 = new Class267(local14);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)I")
	public int method3507() {
		return this.anInt4248;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(JILjava/lang/Object;B)V")
	public void method3508(@OriginalArg(0) long arg0, @OriginalArg(2) Object arg1) {
		if (this.anInt4248 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method3509(arg0);
		this.anInt4261--;
		while (this.anInt4261 < 0) {
			@Pc(44) Class3_Sub10_Sub12 local44 = (Class3_Sub10_Sub12) this.aClass279_1.method6909();
			this.method3520(local44);
		}
		@Pc(57) Class3_Sub10_Sub12_Sub1 local57 = new Class3_Sub10_Sub12_Sub1(arg1, 1);
		this.aClass267_17.method6640(local57, arg0);
		this.aClass279_1.method6910(local57);
		local57.aLong277 = 0L;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(JB)V")
	private void method3509(@OriginalArg(0) long arg0) {
		@Pc(14) Class3_Sub10_Sub12 local14 = (Class3_Sub10_Sub12) this.aClass267_17.method6644(arg0);
		this.method3520(local14);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Z)I")
	public int method3510() {
		return this.anInt4261;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
	public Object method3512(@OriginalArg(1) long arg0) {
		@Pc(10) Class3_Sub10_Sub12 local10 = (Class3_Sub10_Sub12) this.aClass267_17.method6644(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(18) Object local18 = local10.method5671();
		if (local18 == null) {
			local10.method7820();
			local10.method7643();
			this.anInt4261 += local10.anInt6769;
			return null;
		}
		if (local10.method5674()) {
			@Pc(63) Class3_Sub10_Sub12_Sub1 local63 = new Class3_Sub10_Sub12_Sub1(local18, local10.anInt6769);
			this.aClass267_17.method6640(local63, local10.aLong285);
			this.aClass279_1.method6910(local63);
			local63.aLong277 = 0L;
			local10.method7820();
			local10.method7643();
		} else {
			this.aClass279_1.method6910(local10);
			local10.aLong277 = 0L;
		}
		return local18;
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(B)Ljava/lang/Object;")
	public Object method3514() {
		@Pc(16) Class3_Sub10_Sub12 local16 = (Class3_Sub10_Sub12) this.aClass267_17.method6650();
		while (local16 != null) {
			@Pc(22) Object local22 = local16.method5671();
			if (local22 != null) {
				return local22;
			}
			@Pc(28) Class3_Sub10_Sub12 local28 = local16;
			local16 = (Class3_Sub10_Sub12) this.aClass267_17.method6650();
			local28.method7820();
			local28.method7643();
			this.anInt4261 += local28.anInt6769;
		}
		return null;
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)V")
	public void method3516() {
		for (@Pc(19) Class3_Sub10_Sub12 local19 = (Class3_Sub10_Sub12) this.aClass279_1.method6908(); local19 != null; local19 = (Class3_Sub10_Sub12) this.aClass279_1.method6906()) {
			if (local19.method5674()) {
				local19.method7820();
				local19.method7643();
				this.anInt4261 += local19.anInt6769;
			}
		}
	}

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "(B)I")
	public int method3517() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) Class3_Sub10_Sub12 local13 = (Class3_Sub10_Sub12) this.aClass279_1.method6908(); local13 != null; local13 = (Class3_Sub10_Sub12) this.aClass279_1.method6906()) {
			if (!local13.method5674()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "(B)Ljava/lang/Object;")
	public Object method3518() {
		@Pc(11) Class3_Sub10_Sub12 local11 = (Class3_Sub10_Sub12) this.aClass267_17.method6643();
		while (local11 != null) {
			@Pc(17) Object local17 = local11.method5671();
			if (local17 != null) {
				return local17;
			}
			@Pc(21) Class3_Sub10_Sub12 local21 = local11;
			local11 = (Class3_Sub10_Sub12) this.aClass267_17.method6650();
			local21.method7820();
			local21.method7643();
			this.anInt4261 += local21.anInt6769;
		}
		return null;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(JLjava/lang/Object;B)V")
	public void method3519(@OriginalArg(0) long arg0, @OriginalArg(1) Object arg1) {
		this.method3508(arg0, arg1);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!oe;B)V")
	private void method3520(@OriginalArg(0) Class3_Sub10_Sub12 arg0) {
		if (arg0 != null) {
			arg0.method7820();
			arg0.method7643();
			this.anInt4261 += arg0.anInt6769;
		}
	}

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "(Z)V")
	public void method3521() {
		this.aClass279_1.method6905();
		this.aClass267_17.method6648();
		this.anInt4261 = this.anInt4248;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(BI)V")
	public void method3522(@OriginalArg(1) int arg0) {
		if (Static396.aClass127_1 == null) {
			return;
		}
		for (@Pc(21) Class3_Sub10_Sub12 local21 = (Class3_Sub10_Sub12) this.aClass279_1.method6908(); local21 != null; local21 = (Class3_Sub10_Sub12) this.aClass279_1.method6906()) {
			if (local21.method5674()) {
				if (local21.method5671() == null) {
					local21.method7820();
					local21.method7643();
					this.anInt4261++;
				}
			} else if (++local21.aLong277 > (long) arg0) {
				@Pc(65) Class3_Sub10_Sub12 local65 = Static396.aClass127_1.method3560(local21);
				this.aClass267_17.method6640(local65, local21.aLong285);
				Static492.method7172(local21, local65);
				local21.method7820();
				local21.method7643();
			}
		}
	}
}
