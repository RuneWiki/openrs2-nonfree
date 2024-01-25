import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oba")
public final class Class250 {

	@OriginalMember(owner = "client!oba", name = "z", descriptor = "I")
	public int anInt6862;

	@OriginalMember(owner = "client!oba", name = "i", descriptor = "Lclient!de;")
	private final Class69 aClass69_38 = new Class69(64);

	@OriginalMember(owner = "client!oba", name = "w", descriptor = "Lclient!de;")
	public final Class69 aClass69_39 = new Class69(50);

	@OriginalMember(owner = "client!oba", name = "x", descriptor = "Lclient!to;")
	public final Class335 aClass335_1 = new Class335(250);

	@OriginalMember(owner = "client!oba", name = "y", descriptor = "Lclient!iq;")
	private final Class165 aClass165_1 = new Class165();

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "Z")
	private boolean aBoolean484;

	@OriginalMember(owner = "client!oba", name = "B", descriptor = "Lclient!qu;")
	private final Class293 aClass293_2;

	@OriginalMember(owner = "client!oba", name = "g", descriptor = "Lclient!nd;")
	private final Class238 aClass238_181;

	@OriginalMember(owner = "client!oba", name = "o", descriptor = "Lclient!nd;")
	public final Class238 aClass238_182;

	@OriginalMember(owner = "client!oba", name = "h", descriptor = "I")
	public final int anInt6852;

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "I")
	public final int anInt6847;

	@OriginalMember(owner = "client!oba", name = "A", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray38;

	@OriginalMember(owner = "client!oba", name = "C", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray39;

	@OriginalMember(owner = "client!oba", name = "<init>", descriptor = "(Lclient!al;IZLclient!qu;Lclient!nd;Lclient!nd;)V")
	public Class250(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class293 arg3, @OriginalArg(4) Class238 arg4, @OriginalArg(5) Class238 arg5) {
		this.aBoolean484 = arg2;
		this.aClass293_2 = arg3;
		this.aClass238_181 = arg4;
		this.aClass238_182 = arg5;
		this.anInt6852 = arg1;
		if (this.aClass238_181 == null) {
			this.anInt6847 = 0;
		} else {
			@Pc(49) int local49 = this.aClass238_181.method5569() - 1;
			this.anInt6847 = this.aClass238_181.method5592(local49) + local49 * 256;
		}
		this.aStringArray38 = new String[] { null, null, Static573.aClass345_9.method7951(this.anInt6852), null, null };
		this.aStringArray39 = new String[] { null, null, null, null, Static573.aClass345_10.method7951(this.anInt6852) };
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(I)V")
	public void method5956() {
		@Pc(6) Class69 local6 = this.aClass69_38;
		synchronized (this.aClass69_38) {
			this.aClass69_38.method1904();
		}
		local6 = this.aClass69_39;
		synchronized (this.aClass69_39) {
			this.aClass69_39.method1904();
		}
		@Pc(54) Class335 local54 = this.aClass335_1;
		synchronized (this.aClass335_1) {
			this.aClass335_1.method7848();
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(II)V")
	public void method5957(@OriginalArg(0) int arg0) {
		this.anInt6862 = arg0;
		@Pc(14) Class69 local14 = this.aClass69_39;
		synchronized (this.aClass69_39) {
			this.aClass69_39.method1905();
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(B)V")
	public void method5959() {
		@Pc(20) Class335 local20 = this.aClass335_1;
		synchronized (this.aClass335_1) {
			this.aClass335_1.method7841();
		}
	}

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "(II)Lclient!tda;")
	public Class327 method5960(@OriginalArg(1) int arg0) {
		@Pc(6) Class69 local6 = this.aClass69_38;
		@Pc(16) Class327 local16;
		synchronized (this.aClass69_38) {
			local16 = (Class327) this.aClass69_38.method1919((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class238 local29 = this.aClass238_181;
		@Pc(42) byte[] local42;
		synchronized (this.aClass238_181) {
			local42 = this.aClass238_181.method5567(Static359.method5357(arg0), Static234.method3743(arg0));
		}
		local16 = new Class327();
		local16.anInt8714 = arg0;
		local16.aClass250_2 = this;
		local16.aStringArray49 = new String[] { null, null, Static573.aClass345_9.method7951(this.anInt6852), null, null };
		local16.aStringArray48 = new String[] { null, null, null, null, Static573.aClass345_10.method7951(this.anInt6852) };
		if (local42 != null) {
			local16.method7504(new Class2_Sub17(local42));
		}
		local16.method7510();
		if (local16.anInt8761 != -1) {
			local16.method7509(this.method5960(local16.anInt8761), this.method5960(local16.anInt8744));
		}
		if (local16.anInt8726 != -1) {
			local16.method7502(this.method5960(local16.anInt8730), this.method5960(local16.anInt8726));
		}
		if (!this.aBoolean484 && local16.aBoolean621) {
			local16.aString86 = Static573.aClass345_7.method7951(this.anInt6852);
			local16.anIntArray650 = null;
			local16.aBoolean622 = false;
			local16.aStringArray49 = this.aStringArray38;
			local16.aStringArray48 = this.aStringArray39;
			local16.anInt8753 = 0;
			if (local16.aClass323_34 != null) {
				@Pc(195) boolean local195 = false;
				for (@Pc(200) Class2 local200 = local16.aClass323_34.method7480(); local200 != null; local200 = local16.aClass323_34.method7482()) {
					@Pc(209) Class328 local209 = this.aClass293_2.method6807((int) local200.aLong278);
					if (local209.aBoolean623) {
						local200.method8920();
					} else {
						local195 = true;
					}
				}
				if (!local195) {
					local16.aClass323_34 = null;
				}
			}
		}
		@Pc(233) Class69 local233 = this.aClass69_38;
		synchronized (this.aClass69_38) {
			this.aClass69_38.method1917((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(ZB)V")
	public void method5961(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean484 != arg0) {
			this.aBoolean484 = arg0;
			this.method5966();
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(ZIZLclient!da;Lclient!ha;ILclient!qe;IILclient!ha;II)Lclient!iea;")
	public Class31 method5962(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class37 arg3, @OriginalArg(4) Class13 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class284 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class13 arg9, @OriginalArg(11) int arg10) {
		@Pc(14) Class31 local14 = this.method5963(arg7, arg9, arg6, arg10, arg8, arg5, arg1);
		if (local14 != null) {
			return local14;
		}
		@Pc(29) Class327 local29 = this.method5960(arg7);
		if (arg10 > 1 && local29.anIntArray649 != null) {
			@Pc(37) int local37 = -1;
			for (@Pc(39) int local39 = 0; local39 < 10; local39++) {
				if (local29.anIntArray651[local39] <= arg10 && local29.anIntArray651[local39] != 0) {
					local37 = local29.anIntArray649[local39];
				}
			}
			if (local37 != -1) {
				local29 = this.method5960(local37);
			}
		}
		@Pc(88) int[] local88 = local29.method7506(arg8, arg10, arg4, arg6, arg9, arg3, arg5, arg0, arg1);
		if (local88 == null) {
			return null;
		}
		@Pc(103) Class31 local103;
		if (arg2) {
			local103 = arg4.method8088(36, 32, local88, 36);
		} else {
			local103 = arg9.method8088(36, 32, local88, 36);
		}
		if (!arg2) {
			@Pc(119) Class165 local119 = new Class165();
			local119.aBoolean358 = arg6 != null;
			local119.anInt4766 = arg8;
			local119.anInt4767 = arg9.anInt9527;
			local119.anInt4764 = arg1;
			local119.anInt4769 = arg7;
			local119.anInt4768 = arg5;
			local119.anInt4760 = arg10;
			this.aClass335_1.method7846(local119, local103);
		}
		return local103;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(ILclient!ha;Lclient!qe;IIIII)Lclient!iea;")
	public Class31 method5963(@OriginalArg(0) int arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(2) Class284 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass165_1.anInt4760 = arg3;
		this.aClass165_1.anInt4767 = arg1.anInt9527;
		this.aClass165_1.anInt4764 = arg6;
		this.aClass165_1.anInt4769 = arg0;
		this.aClass165_1.aBoolean358 = arg2 != null;
		this.aClass165_1.anInt4766 = arg4;
		this.aClass165_1.anInt4768 = arg5;
		return (Class31) this.aClass335_1.method7845(this.aClass165_1);
	}

	@OriginalMember(owner = "client!oba", name = "c", descriptor = "(I)V")
	public void method5964() {
		@Pc(2) Class69 local2 = this.aClass69_39;
		synchronized (this.aClass69_39) {
			this.aClass69_39.method1905();
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IB)V")
	public void method5965() {
		@Pc(6) Class69 local6 = this.aClass69_38;
		synchronized (this.aClass69_38) {
			this.aClass69_38.method1910(5);
		}
		@Pc(30) Class69 local30 = this.aClass69_39;
		synchronized (this.aClass69_39) {
			this.aClass69_39.method1910(5);
		}
		@Pc(46) Class335 local46 = this.aClass335_1;
		synchronized (this.aClass335_1) {
			this.aClass335_1.method7847();
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(Z)V")
	public void method5966() {
		@Pc(6) Class69 local6 = this.aClass69_38;
		synchronized (this.aClass69_38) {
			this.aClass69_38.method1905();
		}
		local6 = this.aClass69_39;
		synchronized (this.aClass69_39) {
			this.aClass69_39.method1905();
		}
		@Pc(36) Class335 local36 = this.aClass335_1;
		synchronized (this.aClass335_1) {
			this.aClass335_1.method7841();
		}
	}
}
