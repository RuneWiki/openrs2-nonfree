import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class311 {

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!rd", name = "m", descriptor = "I")
	private int anInt8522;

	@OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
	private int anInt8523;

	@OriginalMember(owner = "client!rd", name = "k", descriptor = "Lclient!dfa;")
	private Class74 aClass74_60;

	@OriginalMember(owner = "client!rd", name = "t", descriptor = "Ljava/lang/Object;")
	private Object anObject21;

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "Ljava/lang/String;")
	private String aString99 = "null";

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method7461(@OriginalArg(1) String arg0) {
		if (this.anObject21 == null) {
			return false;
		}
		if (this.aClass74_60 == null) {
			this.method7473();
		}
		for (@Pc(35) Class6_Sub21 local35 = (Class6_Sub21) this.aClass74_60.method1401(Static248.method4321(arg0)); local35 != null; local35 = (Class6_Sub21) this.aClass74_60.method1407()) {
			if (local35.aString45.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)I")
	public int method7462() {
		return this.anInt8523;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(II)I")
	public int method7464(@OriginalArg(0) int arg0) {
		if (this.anObject21 == null) {
			return this.anInt8522;
		} else if (this.anObject21 instanceof Class74) {
			@Pc(63) Class6_Sub6 local63 = (Class6_Sub6) ((Class74) this.anObject21).method1401((long) arg0);
			return local63 == null ? this.anInt8522 : local63.anInt482;
		} else {
			@Pc(26) Integer[] local26 = (Integer[]) this.anObject21;
			if (arg0 >= 0 && arg0 < local26.length) {
				@Pc(45) Integer local45 = local26[arg0];
				return local45 == null ? this.anInt8522 : local45;
			} else {
				return this.anInt8522;
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)Z")
	public boolean method7466(@OriginalArg(1) int arg0) {
		if (this.anObject21 == null) {
			return false;
		}
		if (this.aClass74_60 == null) {
			this.method7472();
		}
		@Pc(33) Class6_Sub6 local33 = (Class6_Sub6) this.aClass74_60.method1401((long) arg0);
		return local33 != null;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILclient!jc;)V")
	public void method7467(@OriginalArg(1) Class6_Sub15 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3030();
			if (local5 == 0) {
				return;
			}
			this.method7469(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILclient!jc;I)V")
	private void method7469(@OriginalArg(1) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar4 = Static383.method5912(arg0.method3027());
		} else if (arg1 == 2) {
			this.aChar5 = Static383.method5912(arg0.method3027());
		} else if (arg1 == 3) {
			this.aString99 = arg0.method3046();
		} else if (arg1 == 4) {
			this.anInt8522 = arg0.method3015();
		} else {
			@Pc(92) int local92;
			if (arg1 == 5 || arg1 == 6) {
				this.anInt8523 = arg0.method3018();
				@Pc(84) Class74 local84 = new Class74(Static314.method4970(this.anInt8523));
				for (@Pc(86) int local86 = 0; local86 < this.anInt8523; local86++) {
					local92 = arg0.method3015();
					@Pc(102) Class6 local102;
					if (arg1 == 5) {
						local102 = new Class6_Sub43(arg0.method3046());
					} else {
						local102 = new Class6_Sub6(arg0.method3015());
					}
					local84.method1399(local102, (long) local92);
				}
				this.anObject21 = local84;
			} else {
				@Pc(136) int local136;
				@Pc(152) int local152;
				if (arg1 == 7) {
					local136 = arg0.method3018();
					this.anInt8523 = arg0.method3018();
					@Pc(144) String[] local144 = new String[local136];
					for (local92 = 0; local92 < this.anInt8523; local92++) {
						local152 = arg0.method3018();
						local144[local152] = arg0.method3046();
					}
					this.anObject21 = local144;
				} else if (arg1 == 8) {
					local136 = arg0.method3018();
					this.anInt8523 = arg0.method3018();
					@Pc(187) Integer[] local187 = new Integer[local136];
					for (local92 = 0; local92 < this.anInt8523; local92++) {
						local152 = arg0.method3018();
						local187[local152] = Integer.valueOf(arg0.method3015());
					}
					this.anObject21 = local187;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public String method7471(@OriginalArg(0) int arg0) {
		if (this.anObject21 == null) {
			return this.aString99;
		} else if (this.anObject21 instanceof Class74) {
			@Pc(29) Class6_Sub43 local29 = (Class6_Sub43) ((Class74) this.anObject21).method1401((long) arg0);
			return local29 == null ? this.aString99 : local29.aString89;
		} else {
			@Pc(42) String[] local42 = (String[]) this.anObject21;
			if (arg0 >= 0 && arg0 < local42.length) {
				@Pc(61) String local61 = local42[arg0];
				return local61 == null ? this.aString99 : local61;
			} else {
				return this.aString99;
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
	private void method7472() {
		@Pc(33) Class6_Sub6 local33;
		if (this.anObject21 instanceof Class74) {
			@Pc(62) Class74 local62 = (Class74) this.anObject21;
			this.aClass74_60 = new Class74(local62.method1406());
			for (@Pc(79) Class6_Sub6 local79 = (Class6_Sub6) local62.method1404(); local79 != null; local79 = (Class6_Sub6) local62.method1405()) {
				local33 = new Class6_Sub6((int) local79.aLong346);
				this.aClass74_60.method1399(local33, (long) local79.anInt482);
			}
			return;
		}
		@Pc(9) Integer[] local9 = (Integer[]) this.anObject21;
		this.aClass74_60 = new Class74(Static314.method4970(local9.length));
		for (@Pc(20) int local20 = 0; local20 < local9.length; local20++) {
			if (local9[local20] != null) {
				local33 = new Class6_Sub6(local20);
				this.aClass74_60.method1399(local33, (long) local9[local20]);
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)V")
	private void method7473() {
		@Pc(36) Class6_Sub21 local36;
		if (this.anObject21 instanceof Class74) {
			@Pc(67) Class74 local67 = (Class74) this.anObject21;
			this.aClass74_60 = new Class74(local67.method1406());
			for (@Pc(80) Class6_Sub43 local80 = (Class6_Sub43) local67.method1404(); local80 != null; local80 = (Class6_Sub43) local67.method1405()) {
				local36 = new Class6_Sub21(local80.aString89, (int) local80.aLong346);
				this.aClass74_60.method1399(local36, Static248.method4321(local80.aString89));
			}
			return;
		}
		@Pc(9) String[] local9 = (String[]) this.anObject21;
		this.aClass74_60 = new Class74(Static314.method4970(local9.length));
		for (@Pc(20) int local20 = 0; local20 < local9.length; local20++) {
			if (local9[local20] != null) {
				local36 = new Class6_Sub21(local9[local20], local20);
				this.aClass74_60.method1399(local36, Static248.method4321(local9[local20]));
			}
		}
	}
}
