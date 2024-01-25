import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class12 {

	@OriginalMember(owner = "client!ao", name = "x", descriptor = "I")
	public int anInt423;

	@OriginalMember(owner = "client!ao", name = "k", descriptor = "Lclient!jv;")
	private final Class126 aClass126_1 = new Class126(64);

	@OriginalMember(owner = "client!ao", name = "r", descriptor = "Lclient!jv;")
	public final Class126 aClass126_2 = new Class126(50);

	@OriginalMember(owner = "client!ao", name = "v", descriptor = "Lclient!pn;")
	public final Class193 aClass193_1 = new Class193(250);

	@OriginalMember(owner = "client!ao", name = "w", descriptor = "Lclient!bt;")
	private final Class31 aClass31_1 = new Class31();

	@OriginalMember(owner = "client!ao", name = "h", descriptor = "Lclient!bu;")
	public final Class32 aClass32_6;

	@OriginalMember(owner = "client!ao", name = "A", descriptor = "Lclient!bm;")
	private final Class26 aClass26_1;

	@OriginalMember(owner = "client!ao", name = "o", descriptor = "Z")
	private boolean aBoolean26;

	@OriginalMember(owner = "client!ao", name = "j", descriptor = "Lclient!bu;")
	private final Class32 aClass32_7;

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "I")
	public final int anInt409;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "I")
	public final int anInt408;

	@OriginalMember(owner = "client!ao", name = "z", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray5;

	@OriginalMember(owner = "client!ao", name = "y", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray4;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lclient!oq;IZLclient!bm;Lclient!bu;Lclient!bu;)V")
	public Class12(@OriginalArg(0) Class183 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class26 arg3, @OriginalArg(4) Class32 arg4, @OriginalArg(5) Class32 arg5) {
		this.aClass32_6 = arg5;
		this.aClass26_1 = arg3;
		this.aBoolean26 = arg2;
		this.aClass32_7 = arg4;
		this.anInt409 = arg1;
		if (this.aClass32_7 == null) {
			this.anInt408 = 0;
		} else {
			@Pc(49) int local49 = this.aClass32_7.method809() - 1;
			this.anInt408 = this.aClass32_7.method790(local49) + local49 * 256;
		}
		this.aStringArray5 = new String[] { null, null, Static205.aClass189_126.method4262(this.anInt409), null, null };
		this.aStringArray4 = new String[] { null, null, null, null, Static67.aClass189_50.method4262(this.anInt409) };
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)V")
	public void method325(@OriginalArg(1) int arg0) {
		this.anInt423 = arg0;
		@Pc(23) Class126 local23 = this.aClass126_2;
		synchronized (this.aClass126_2) {
			this.aClass126_2.method3135();
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIILclient!qa;IILclient!qo;)Lclient!f;")
	public Class8 method326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class172 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class206 arg6) {
		this.aClass31_1.anInt1077 = arg0;
		this.aClass31_1.aBoolean98 = arg6 != null;
		this.aClass31_1.anInt1081 = arg3;
		this.aClass31_1.anInt1082 = arg1;
		this.aClass31_1.anInt1080 = arg4.anInt6964;
		this.aClass31_1.anInt1084 = arg2;
		this.aClass31_1.anInt1086 = arg5;
		return (Class8) this.aClass193_1.method4296(this.aClass31_1);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(BI)Lclient!fq;")
	public Class81 method327(@OriginalArg(1) int arg0) {
		@Pc(6) Class126 local6 = this.aClass126_1;
		@Pc(16) Class81 local16;
		synchronized (this.aClass126_1) {
			local16 = (Class81) this.aClass126_1.method3141((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass32_7.method785(Static46.method858(arg0), Static446.method5884(arg0));
		local16 = new Class81();
		local16.aClass12_1 = this;
		local16.anInt2565 = arg0;
		local16.aStringArray23 = new String[] { null, null, Static205.aClass189_126.method4262(this.anInt409), null, null };
		local16.aStringArray22 = new String[] { null, null, null, null, Static67.aClass189_50.method4262(this.anInt409) };
		if (local37 != null) {
			local16.method1944(new Class3_Sub7(local37));
		}
		local16.method1941();
		if (local16.anInt2541 != -1) {
			local16.method1946(this.method327(local16.anInt2541), this.method327(local16.anInt2548));
		}
		if (local16.anInt2554 != -1) {
			local16.method1947(this.method327(local16.anInt2554), this.method327(local16.anInt2546));
		}
		if (!this.aBoolean26 && local16.aBoolean225) {
			local16.aString17 = Static166.aClass189_104.method4262(this.anInt409);
			local16.anIntArray144 = null;
			local16.aStringArray22 = this.aStringArray4;
			local16.aStringArray23 = this.aStringArray5;
			local16.anInt2563 = 0;
			local16.aBoolean226 = false;
			if (local16.aClass11_12 != null) {
				@Pc(189) boolean local189 = false;
				for (@Pc(194) Class3 local194 = local16.aClass11_12.method313(); local194 != null; local194 = local16.aClass11_12.method316()) {
					@Pc(203) Class224 local203 = this.aClass26_1.method691((int) local194.aLong234);
					if (local203.aBoolean533) {
						local194.method5977();
					} else {
						local189 = true;
					}
				}
				if (!local189) {
					local16.aClass11_12 = null;
				}
			}
		}
		@Pc(227) Class126 local227 = this.aClass126_1;
		synchronized (this.aClass126_1) {
			this.aClass126_1.method3132((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IZ)V")
	public void method328(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean26) {
			this.aBoolean26 = arg0;
			this.method331();
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
	public void method330() {
		@Pc(6) Class193 local6 = this.aClass193_1;
		synchronized (this.aClass193_1) {
			this.aClass193_1.method4304();
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)V")
	public void method331() {
		@Pc(10) Class126 local10 = this.aClass126_1;
		synchronized (this.aClass126_1) {
			this.aClass126_1.method3135();
		}
		local10 = this.aClass126_2;
		synchronized (this.aClass126_2) {
			this.aClass126_2.method3135();
		}
		@Pc(40) Class193 local40 = this.aClass193_1;
		synchronized (this.aClass193_1) {
			this.aClass193_1.method4304();
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(ZZLclient!qo;IIIIILclient!qa;ILclient!qa;Lclient!oa;)Lclient!f;")
	public Class8 method335(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class206 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class172 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class172 arg9, @OriginalArg(11) Class59 arg10) {
		@Pc(16) Class8 local16 = this.method326(arg8, arg3, arg5, arg6, arg7, arg4, arg2);
		if (local16 != null) {
			return local16;
		}
		@Pc(31) Class81 local31 = this.method327(arg4);
		if (arg6 > 1 && local31.lb != null) {
			@Pc(41) int local41 = -1;
			for (@Pc(43) int local43 = 0; local43 < 10; local43++) {
				if (arg6 >= local31.anIntArray143[local43] && local31.anIntArray143[local43] != 0) {
					local41 = local31.lb[local43];
				}
			}
			if (local41 != -1) {
				local31 = this.method327(local41);
			}
		}
		@Pc(93) int[] local93 = local31.method1937(arg5, arg2, arg6, arg0, arg10, arg3, arg9, arg7, arg8);
		if (local93 == null) {
			return null;
		}
		@Pc(107) Class8 local107;
		if (arg1) {
			local107 = arg9.method5478(local93, 36, 36, 32);
		} else {
			local107 = arg7.method5478(local93, 36, 36, 32);
		}
		if (!arg1) {
			@Pc(123) Class31 local123 = new Class31();
			local123.anInt1080 = arg7.anInt6964;
			local123.anInt1077 = arg8;
			local123.aBoolean98 = arg2 != null;
			local123.anInt1086 = arg4;
			local123.anInt1084 = arg5;
			local123.anInt1081 = arg6;
			local123.anInt1082 = arg3;
			this.aClass193_1.method4302(local123, local107);
		}
		return local107;
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V")
	public void method336() {
		@Pc(2) Class126 local2 = this.aClass126_1;
		synchronized (this.aClass126_1) {
			this.aClass126_1.method3131();
		}
		@Pc(29) Class126 local29 = this.aClass126_2;
		synchronized (this.aClass126_2) {
			this.aClass126_2.method3131();
		}
		@Pc(44) Class193 local44 = this.aClass193_1;
		synchronized (this.aClass193_1) {
			this.aClass193_1.method4303();
		}
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "(II)V")
	public void method337() {
		@Pc(2) Class126 local2 = this.aClass126_1;
		synchronized (this.aClass126_1) {
			this.aClass126_1.method3140(5);
		}
		local2 = this.aClass126_2;
		synchronized (this.aClass126_2) {
			this.aClass126_2.method3140(5);
		}
		@Pc(46) Class193 local46 = this.aClass193_1;
		synchronized (this.aClass193_1) {
			this.aClass193_1.method4297();
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Z)V")
	public void method338() {
		@Pc(12) Class126 local12 = this.aClass126_2;
		synchronized (this.aClass126_2) {
			this.aClass126_2.method3135();
		}
	}
}
