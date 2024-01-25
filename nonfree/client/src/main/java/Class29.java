import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class29 {

	@OriginalMember(owner = "client!bc", name = "x", descriptor = "I")
	public int anInt1160;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "Lclient!jn;")
	private final Class167 aClass167_2 = new Class167(64);

	@OriginalMember(owner = "client!bc", name = "s", descriptor = "Lclient!jn;")
	public final Class167 aClass167_3 = new Class167(50);

	@OriginalMember(owner = "client!bc", name = "v", descriptor = "Lclient!sn;")
	public final Class307 aClass307_1 = new Class307(250);

	@OriginalMember(owner = "client!bc", name = "w", descriptor = "Lclient!qea;")
	private final Class274 aClass274_1 = new Class274();

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "Lclient!vo;")
	private final Class348 aClass348_17;

	@OriginalMember(owner = "client!bc", name = "z", descriptor = "Lclient!fi;")
	private final Class107 aClass107_1;

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "Lclient!vo;")
	public final Class348 aClass348_18;

	@OriginalMember(owner = "client!bc", name = "r", descriptor = "Z")
	private boolean aBoolean106;

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
	public final int anInt1153;

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
	public final int anInt1147;

	@OriginalMember(owner = "client!bc", name = "y", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray1;

	@OriginalMember(owner = "client!bc", name = "A", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray2;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lclient!gn;IZLclient!fi;Lclient!vo;Lclient!vo;)V")
	public Class29(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class107 arg3, @OriginalArg(4) Class348 arg4, @OriginalArg(5) Class348 arg5) {
		this.aClass348_17 = arg4;
		this.aClass107_1 = arg3;
		this.aClass348_18 = arg5;
		this.aBoolean106 = arg2;
		this.anInt1153 = arg1;
		if (this.aClass348_17 == null) {
			this.anInt1147 = 0;
		} else {
			@Pc(54) int local54 = this.aClass348_17.method7985() - 1;
			this.anInt1147 = local54 * 256 + this.aClass348_17.method7981(local54);
		}
		this.aStringArray1 = new String[] { null, null, Static223.aClass152_11.method3624(this.anInt1153), null, null };
		this.aStringArray2 = new String[] { null, null, null, null, Static223.aClass152_12.method3624(this.anInt1153) };
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
	public void method976() {
		@Pc(2) Class167 local2 = this.aClass167_2;
		synchronized (this.aClass167_2) {
			this.aClass167_2.method3961();
		}
		local2 = this.aClass167_3;
		synchronized (this.aClass167_3) {
			this.aClass167_3.method3961();
		}
		@Pc(55) Class307 local55 = this.aClass307_1;
		synchronized (this.aClass307_1) {
			this.aClass307_1.method7076();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZ)Lclient!nk;")
	public Class236 method977(@OriginalArg(0) int arg0) {
		@Pc(8) Class167 local8 = this.aClass167_2;
		@Pc(18) Class236 local18;
		synchronized (this.aClass167_2) {
			local18 = (Class236) this.aClass167_2.method3966((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(38) Class348 local38 = this.aClass348_17;
		@Pc(51) byte[] local51;
		synchronized (this.aClass348_17) {
			local51 = this.aClass348_17.method7964(Static480.method8075(arg0), Static47.method1138(arg0));
		}
		local18 = new Class236();
		local18.aClass29_2 = this;
		local18.anInt6830 = arg0;
		local18.aStringArray26 = new String[] { null, null, Static223.aClass152_11.method3624(this.anInt1153), null, null };
		local18.aStringArray27 = new String[] { null, null, null, null, Static223.aClass152_12.method3624(this.anInt1153) };
		if (local51 != null) {
			local18.method5335(new Class4_Sub13(local51));
		}
		local18.method5325();
		if (local18.anInt6776 != -1) {
			local18.method5338(this.method977(local18.anInt6776), this.method977(local18.lb));
		}
		if (local18.anInt6783 != -1) {
			local18.method5326(this.method977(local18.anInt6783), this.method977(local18.anInt6778));
		}
		if (!this.aBoolean106 && local18.aBoolean471) {
			local18.aString139 = Static223.aClass152_9.method3624(this.anInt1153);
			local18.aStringArray26 = this.aStringArray1;
			local18.aBoolean470 = false;
			local18.anIntArray384 = null;
			local18.aStringArray27 = this.aStringArray2;
			local18.anInt6804 = 0;
			if (local18.aClass221_23 != null) {
				@Pc(216) boolean local216 = false;
				for (@Pc(221) Class4 local221 = local18.aClass221_23.method5072(); local221 != null; local221 = local18.aClass221_23.method5071()) {
					@Pc(231) Class275 local231 = this.aClass107_1.method2503((int) local221.aLong295);
					if (local231.aBoolean585) {
						local221.method8193();
					} else {
						local216 = true;
					}
				}
				if (!local216) {
					local18.aClass221_23 = null;
				}
			}
		}
		@Pc(256) Class167 local256 = this.aClass167_2;
		synchronized (this.aClass167_2) {
			this.aClass167_2.method3974((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZI)V")
	public void method978(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean106 != arg0) {
			this.aBoolean106 = arg0;
			this.method976();
		}
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V")
	public void method980() {
		@Pc(12) Class167 local12 = this.aClass167_3;
		synchronized (this.aClass167_3) {
			this.aClass167_3.method3961();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIBILclient!lw;Lclient!r;II)Lclient!f;")
	public Class88 method981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class206 arg3, @OriginalArg(5) Class7 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aClass274_1.anInt8159 = arg0;
		this.aClass274_1.anInt8162 = arg2;
		this.aClass274_1.anInt8164 = arg5;
		this.aClass274_1.anInt8160 = arg1;
		this.aClass274_1.aBoolean583 = arg3 != null;
		this.aClass274_1.anInt8165 = arg4.anInt10078;
		this.aClass274_1.anInt8166 = arg6;
		return (Class88) this.aClass307_1.method7079(this.aClass274_1);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIZIZILclient!r;Lclient!lw;Lclient!la;Lclient!r;)Lclient!f;")
	public Class88 method982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class7 arg7, @OriginalArg(9) Class206 arg8, @OriginalArg(10) Class45 arg9, @OriginalArg(11) Class7 arg10) {
		@Pc(20) Class88 local20 = this.method981(arg4, arg2, arg6, arg8, arg7, arg1, arg0);
		if (local20 != null) {
			return local20;
		}
		@Pc(29) Class236 local29 = this.method977(arg0);
		if (arg2 > 1 && local29.anIntArray385 != null) {
			@Pc(39) int local39 = -1;
			for (@Pc(41) int local41 = 0; local41 < 10; local41++) {
				if (arg2 >= local29.anIntArray386[local41] && local29.anIntArray386[local41] != 0) {
					local39 = local29.anIntArray385[local41];
				}
			}
			if (local39 != -1) {
				local29 = this.method977(local39);
			}
		}
		@Pc(85) int[] local85 = local29.method5323(arg4, arg10, arg9, arg7, arg6, arg1, arg8, arg5, arg2);
		if (local85 == null) {
			return null;
		}
		@Pc(99) Class88 local99;
		if (arg3) {
			local99 = arg10.method7838(local85, 36, 36, 32);
		} else {
			local99 = arg7.method7838(local85, 36, 36, 32);
		}
		if (!arg3) {
			@Pc(115) Class274 local115 = new Class274();
			local115.anInt8162 = arg6;
			local115.anInt8165 = arg7.anInt10078;
			local115.anInt8160 = arg2;
			local115.aBoolean583 = arg8 != null;
			local115.anInt8159 = arg4;
			local115.anInt8164 = arg1;
			local115.anInt8166 = arg0;
			this.aClass307_1.method7083(local115, local99);
		}
		return local99;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(IZ)V")
	public void method984(@OriginalArg(0) int arg0) {
		this.anInt1160 = arg0;
		@Pc(15) Class167 local15 = this.aClass167_3;
		synchronized (this.aClass167_3) {
			this.aClass167_3.method3961();
		}
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V")
	public void method985() {
		@Pc(2) Class167 local2 = this.aClass167_2;
		synchronized (this.aClass167_2) {
			this.aClass167_2.method3975();
		}
		local2 = this.aClass167_3;
		synchronized (this.aClass167_3) {
			this.aClass167_3.method3975();
		}
		@Pc(42) Class307 local42 = this.aClass307_1;
		synchronized (this.aClass307_1) {
			this.aClass307_1.method7084();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)V")
	public void method986() {
		@Pc(2) Class167 local2 = this.aClass167_2;
		synchronized (this.aClass167_2) {
			this.aClass167_2.method3964(5);
		}
		local2 = this.aClass167_3;
		synchronized (this.aClass167_3) {
			this.aClass167_3.method3964(5);
		}
		@Pc(38) Class307 local38 = this.aClass307_1;
		synchronized (this.aClass307_1) {
			this.aClass307_1.method7081();
		}
	}

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)V")
	public void method989() {
		@Pc(12) Class307 local12 = this.aClass307_1;
		synchronized (this.aClass307_1) {
			this.aClass307_1.method7076();
		}
	}
}
