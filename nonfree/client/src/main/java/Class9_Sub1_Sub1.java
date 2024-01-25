import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class9_Sub1_Sub1 extends Class9_Sub1 {

	@OriginalMember(owner = "client!af", name = "ob", descriptor = "I")
	private int anInt276;

	@OriginalMember(owner = "client!af", name = "Ab", descriptor = "[I")
	public int[] anIntArray24;

	@OriginalMember(owner = "client!af", name = "Jb", descriptor = "I")
	private int anInt293;

	@OriginalMember(owner = "client!af", name = "ub", descriptor = "Z")
	public boolean aBoolean16 = true;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!e;)V")
	public Class9_Sub1_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface2 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!mr;I)V")
	@Override
	public void method5408(@OriginalArg(0) Class23[] arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) Class5_Sub4[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			if (arg0[local3] != null) {
				arg0[local3].method7077(arg1, arg2 == null ? null : arg2[local3], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "e", descriptor = "(Z)V")
	@Override
	public void method5455(@OriginalArg(0) boolean arg0) {
		this.aBoolean16 = arg0;
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(IIIIIII)V")
	private void method499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg4 < 0) {
			arg4 = -arg4;
		}
		@Pc(17) int local17 = arg1 << 8;
		@Pc(22) int local22 = arg3 - arg4;
		if (super.anInt1815 > local22) {
			local22 = super.anInt1815;
		}
		@Pc(35) int local35 = arg3 + arg4 + 1;
		if (super.anInt1830 < local35) {
			local35 = super.anInt1830;
		}
		@Pc(54) int local54 = local22;
		@Pc(58) int local58 = arg4 * arg4;
		@Pc(60) int local60 = 0;
		@Pc(64) int local64 = arg3 - local22;
		@Pc(68) int local68 = local64 * local64;
		if (arg3 > local35) {
			arg3 = local35;
		}
		@Pc(77) int local77 = local68 - local64;
		@Pc(81) int local81 = arg2 >>> 24;
		@Pc(125) int local125;
		@Pc(136) int local136;
		@Pc(151) int local151;
		@Pc(153) int local153;
		if (arg5 == 0 || arg5 == 1 && local81 == 255) {
			while (local54 < arg3) {
				while (local77 <= local58 || local58 >= local68) {
					local68 += local60 + local60;
					local77 += local60++ + local60;
				}
				local125 = arg0 + 1 - local60;
				if (super.anInt1813 > local125) {
					local125 = super.anInt1813;
				}
				local136 = local60 + arg0;
				if (super.anInt1821 < local136) {
					local136 = super.anInt1821;
				}
				local151 = local125 + local54 * super.anInt1832;
				for (local153 = local125; local153 < local136; local153++) {
					if (local17 < this.anIntArray24[local151]) {
						super.anIntArray130[local151] = arg2;
					}
					local151++;
				}
				local54++;
				local68 -= local64-- + local64;
				local77 -= local64 + local64;
			}
			local60 = arg4;
			local64 = local54 - arg3;
			local77 = local64 * local64 + local58;
			local68 = local77 - arg4;
			local77 -= local64;
			while (local35 > local54) {
				while (local77 > local58 && local58 < local68) {
					local77 -= local60-- + local60;
					local68 -= local60 + local60;
				}
				local125 = arg0 - local60;
				if (local125 < super.anInt1813) {
					local125 = super.anInt1813;
				}
				local136 = local60 + arg0;
				if (super.anInt1821 - 1 < local136) {
					local136 = super.anInt1821 - 1;
				}
				local151 = local125 + super.anInt1832 * local54;
				local54++;
				local77 += local64 + local64;
				for (local153 = local125; local153 <= local136; local153++) {
					if (this.anIntArray24[local151] > local17) {
						super.anIntArray130[local151] = arg2;
					}
					local151++;
				}
				local68 += local64++ + local64;
			}
			return;
		}
		@Pc(443) int local443;
		@Pc(460) int local460;
		if (arg5 == 1) {
			@Pc(367) int local367 = (local81 << 24) + ((local81 * (arg2 & 0xFF00) & 0xFF0070) >> 8) + (local81 * (arg2 & 0xFF00FF) >> 8 & 0xFF00FF);
			local125 = 256 - local81;
			while (local54 < arg3) {
				while (local77 <= local58 || local58 >= local68) {
					local68 += local60 + local60;
					local77 += local60++ + local60;
				}
				local136 = arg0 + 1 - local60;
				if (local136 < super.anInt1813) {
					local136 = super.anInt1813;
				}
				local151 = arg0 + local60;
				if (local151 > super.anInt1821) {
					local151 = super.anInt1821;
				}
				local153 = local136 + super.anInt1832 * local54;
				local54++;
				local68 -= local64-- + local64;
				for (local443 = local136; local443 < local151; local443++) {
					if (this.anIntArray24[local153] > local17) {
						local460 = super.anIntArray130[local153];
						local460 = (local125 * (local460 & 0xFF00) >> 8 & 0xFF00) + ((local460 & 0xFF00FF) * local125 >> 8 & 0xFF00FF);
						super.anIntArray130[local153] = local367 + local460;
					}
					local153++;
				}
				local77 -= local64 + local64;
			}
			local60 = arg4;
			local64 = -local64;
			local77 = local64 * local64 + local58;
			local68 = local77 - arg4;
			local77 -= local64;
			while (local54 < local35) {
				while (local58 < local77 && local68 > local58) {
					local77 -= local60-- + local60;
					local68 -= local60 + local60;
				}
				local136 = arg0 - local60;
				if (local136 < super.anInt1813) {
					local136 = super.anInt1813;
				}
				local151 = local60 + arg0;
				if (local151 > super.anInt1821 - 1) {
					local151 = super.anInt1821 - 1;
				}
				local153 = local136 + local54 * super.anInt1832;
				local77 += local64 + local64;
				for (local443 = local136; local443 <= local151; local443++) {
					if (local17 < this.anIntArray24[local153]) {
						local460 = super.anIntArray130[local153];
						local460 = ((local460 & 0xFF00) * local125 >> 8 & 0xFF00) + (local125 * (local460 & 0xFF00FF) >> 8 & 0xFF00FF);
						super.anIntArray130[local153] = local460 + local367;
					}
					local153++;
				}
				local54++;
				local68 += local64++ + local64;
			}
		} else if (arg5 == 2) {
			@Pc(765) int local765;
			while (arg3 > local54) {
				while (local77 <= local58 || local68 <= local58) {
					local68 += local60 + local60;
					local77 += local60++ + local60;
				}
				local125 = arg0 + 1 - local60;
				if (super.anInt1813 > local125) {
					local125 = super.anInt1813;
				}
				local136 = local60 + arg0;
				if (local136 > super.anInt1821) {
					local136 = super.anInt1821;
				}
				local151 = super.anInt1832 * local54 + local125;
				for (local153 = local125; local153 < local136; local153++) {
					if (local17 < this.anIntArray24[local151]) {
						local443 = super.anIntArray130[local151];
						local460 = arg2 + local443;
						local765 = (arg2 & 0xFF00FF) + (local443 & 0xFF00FF);
						@Pc(776) int local776 = (local460 - local765 & 0x10000) + (local765 & 0x1000100);
						super.anIntArray130[local151] = local776 - (local776 >>> 8) | -local776 + local460;
					}
					local151++;
				}
				local68 -= local64-- + local64;
				local54++;
				local77 -= local64 + local64;
			}
			local64 = -local64;
			local60 = arg4;
			local77 = local58 + local64 * local64;
			local68 = local77 - arg4;
			local77 -= local64;
			while (local54 < local35) {
				while (local77 > local58 && local68 > local58) {
					local77 -= local60-- + local60;
					local68 -= local60 + local60;
				}
				local125 = arg0 - local60;
				if (super.anInt1813 > local125) {
					local125 = super.anInt1813;
				}
				local136 = local60 + arg0;
				if (local136 > super.anInt1821 - 1) {
					local136 = super.anInt1821 - 1;
				}
				local151 = local125 + local54 * super.anInt1832;
				for (local153 = local125; local153 <= local136; local153++) {
					if (local17 < this.anIntArray24[local151]) {
						local443 = super.anIntArray130[local151];
						local460 = local443 + arg2;
						local765 = (local443 & 0xFF00FF) + (arg2 & 0xFF00FF);
						local443 = (local765 & 0x1000100) + (local460 - local765 & 0x10000);
						super.anIntArray130[local151] = local460 - local443 | local443 - (local443 >>> 8);
					}
					local151++;
				}
				local54++;
				local77 += local64 + local64;
				local68 += local64++ + local64;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!af", name = "H", descriptor = "()V")
	@Override
	protected void method1654() {
		super.anInt1829 = super.anInt1813 - super.anInt1812;
		super.anInt1808 = super.anInt1815 - super.anInt1824;
		super.anInt1831 = -super.anInt1824 + super.anInt1830;
		super.anInt1806 = super.anInt1821 - super.anInt1812;
		for (@Pc(37) int local37 = 0; local37 < super.anInt1805; local37++) {
			@Pc(46) Class303 local46 = ((Class179_Sub1) super.aClass179Array3[local37]).aClass303_1;
			local46.anInt8843 = super.anInt1824 - super.anInt1815;
			local46.anInt8846 = super.anInt1821 - super.anInt1813;
			local46.anInt8844 = super.anInt1830 - super.anInt1815;
			local46.anInt8841 = -super.anInt1813 + super.anInt1812;
		}
		@Pc(90) int local90 = super.anInt1813 + super.anInt1832 * super.anInt1815;
		for (@Pc(93) int local93 = super.anInt1815; local93 < super.anInt1830; local93++) {
			for (@Pc(97) int local97 = 0; local97 < super.anInt1805; local97++) {
				((Class179_Sub1) super.aClass179Array3[local97]).aClass303_1.anIntArray778[local93 - super.anInt1815] = local90;
			}
			local90 += super.anInt1832;
		}
	}

	@OriginalMember(owner = "client!af", name = "g", descriptor = "(I)V")
	@Override
	public void method5459(@OriginalArg(0) int arg0) {
		super.aClass179Array3[arg0].method7256(Thread.currentThread());
	}

	@OriginalMember(owner = "client!af", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5465(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			super.aCanvas5 = null;
			super.aClass6_Sub13_3 = null;
			if (super.aClass66_18 == null) {
				this.anInt293 = this.anInt276 = 1;
				super.anInt1832 = super.anInt1816 = 1;
				super.anIntArray130 = null;
				this.method1649();
			}
			return;
		}
		@Pc(10) Class6_Sub13 local10 = (Class6_Sub13) super.aClass305_11.method7447((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		super.aCanvas5 = arg0;
		super.aClass6_Sub13_3 = local10;
		if (super.aClass66_18 != null) {
			return;
		}
		super.anInt1832 = local10.anInt8669;
		super.anInt1816 = local10.anInt8670;
		super.anIntArray130 = local10.anIntArray729;
		if (super.anInt1832 != this.anInt293 || this.anInt276 != super.anInt1816) {
			this.anInt276 = super.anInt1816;
			this.anInt293 = super.anInt1832;
			this.anIntArray24 = new int[this.anInt293 * this.anInt276];
		}
		this.method1649();
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIIIILclient!wk;I)V")
	private void method502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class66_Sub1_Sub3 arg7, @OriginalArg(9) int arg8) {
		if (arg3 <= 0 || arg0 <= 0) {
			return;
		}
		@Pc(20) int local20 = arg8 << 8;
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(33) int local33 = arg7.anInt9677 + arg7.anInt9662 + arg7.anInt9679;
		@Pc(43) int local43 = arg7.anInt9660 + arg7.anInt9673 + arg7.anInt9668;
		@Pc(49) int local49 = (local33 << 16) / arg3;
		@Pc(55) int local55 = (local43 << 16) / arg0;
		@Pc(73) int local73;
		if (arg7.anInt9662 > 0) {
			local73 = ((arg7.anInt9662 << 16) + local49 - 1) / local49;
			arg6 += local73;
			local22 = local49 * local73 - (arg7.anInt9662 << 16);
		}
		if (arg7.anInt9679 < local33) {
			arg3 = ((arg7.anInt9679 << 16) + local49 - local22 - 1) / local49;
		}
		if (arg7.anInt9673 > 0) {
			local73 = (local55 + (arg7.anInt9673 << 16) - 1) / local55;
			arg5 += local73;
			local24 = local55 * local73 - (arg7.anInt9673 << 16);
		}
		if (arg7.anInt9660 < local43) {
			arg0 = ((arg7.anInt9660 << 16) + local55 - local24 - 1) / local55;
		}
		local73 = arg5 * super.anInt1832 + arg6;
		@Pc(189) int local189 = super.anInt1832 - arg3;
		if (super.anInt1830 < arg5 + arg0) {
			arg0 -= arg0 + arg5 - super.anInt1830;
		}
		@Pc(223) int local223;
		if (arg5 < super.anInt1815) {
			local223 = super.anInt1815 - arg5;
			arg0 -= local223;
			local73 += super.anInt1832 * local223;
			local24 += local55 * local223;
		}
		if (arg3 + arg6 > super.anInt1821) {
			local223 = arg6 + arg3 - super.anInt1821;
			local189 += local223;
			arg3 -= local223;
		}
		if (super.anInt1813 > arg6) {
			local223 = super.anInt1813 - arg6;
			local73 += local223;
			arg3 -= local223;
			local189 += local223;
			local22 += local223 * local49;
		}
		@Pc(313) int local313;
		@Pc(317) int local317;
		@Pc(319) int local319;
		@Pc(322) int local322;
		@Pc(331) int local331;
		@Pc(334) int local334;
		@Pc(355) int local355;
		@Pc(363) int local363;
		@Pc(371) int local371;
		@Pc(379) int local379;
		@Pc(545) int local545;
		if (arg4 != 0) {
			@Pc(1033) int local1033;
			@Pc(1041) int local1041;
			@Pc(1091) int local1091;
			if (arg4 == 1) {
				if (arg2 == 1) {
					local223 = local22;
					for (local313 = -arg0; local313 < 0; local313++) {
						local317 = arg7.anInt9679 * (local24 >> 16);
						for (local319 = -arg3; local319 < 0; local319++) {
							if (this.anIntArray24[local73] > local20) {
								local322 = arg7.anIntArray833[local317 + (local22 >> 16)];
								local331 = local322 >>> 24;
								local334 = 256 - local331;
								local355 = super.anIntArray130[local73];
								super.anIntArray130[local73] = (local331 * (local322 & 0xFF00FF) + (local355 & 0xFF00FF) * local334 >> 8 & 0xFFFF00FF) + (local331 * ((-16711936 & local322) >>> 8) + local334 * (local355 >>> 8 & 0xFF00FF) & 0xFF00FF00);
							}
							local73++;
							local22 += local49;
						}
						local24 += local55;
						local22 = local223;
						local73 += local189;
					}
				} else if (arg2 == 0) {
					local223 = local22;
					if ((arg1 & 0xFFFFFF) == 16777215) {
						for (local313 = -arg0; local313 < 0; local313++) {
							local317 = arg7.anInt9679 * (local24 >> 16);
							for (local319 = -arg3; local319 < 0; local319++) {
								if (this.anIntArray24[local73] > local20) {
									local322 = arg7.anIntArray833[local317 + (local22 >> 16)];
									local331 = (arg1 >>> 24) * (local322 >>> 24) >> 8;
									local334 = 256 - local331;
									local355 = super.anIntArray130[local73];
									super.anIntArray130[local73] = (local334 * (local355 & 0xFF00) + (local322 & 0xFF00) * local331 & 0xFF0000) + (local334 * (local355 & 0xFF00FF) + local331 * (local322 & 0xFF00FF) & 0xFF00FF00) >> 8;
								}
								local73++;
								local22 += local49;
							}
							local24 += local55;
							local22 = local223;
							local73 += local189;
						}
					} else {
						local313 = arg1 >> 16 & 0xFF;
						local317 = arg1 >> 8 & 0xFF;
						local319 = arg1 & 0xFF;
						for (local322 = -arg0; local322 < 0; local322++) {
							local331 = arg7.anInt9679 * (local24 >> 16);
							local24 += local55;
							for (local334 = -arg3; local334 < 0; local334++) {
								if (local20 < this.anIntArray24[local73]) {
									local355 = arg7.anIntArray833[(local22 >> 16) + local331];
									local363 = (local355 >>> 24) * (arg1 >>> 24) >> 8;
									local371 = 256 - local363;
									if (local363 == 255) {
										local379 = (local355 & 0xFF0000) * local313 & 0xFF000000;
										local1033 = local317 * (local355 & 0xFF00) & 0xFF0000;
										local1041 = local319 * (local355 & 0xFF) & 0xFF00;
										super.anIntArray130[local73] = (local379 | local1033 | local1041) >>> 8;
									} else {
										local379 = (local355 & 0xFF0000) * local313 & 0xFF000000;
										local1033 = local317 * (local355 & 0xFF00) & 0xFF0000;
										local1041 = local319 * (local355 & 0xFF) & 0xFF00;
										local355 = (local1033 | local379 | local1041) >>> 8;
										local1091 = super.anIntArray130[local73];
										super.anIntArray130[local73] = (local371 * (local1091 & 0xFF00FF) + (local355 & 0xFF00FF) * local363 & 0xFF00FF00) + ((local355 & 0xFF00) * local363 + (local1091 & 0xFF00) * local371 & 0xFF0000) >> 8;
									}
								}
								local73++;
								local22 += local49;
							}
							local22 = local223;
							local73 += local189;
						}
					}
				} else if (arg2 == 3) {
					local223 = local22;
					for (local313 = -arg0; local313 < 0; local313++) {
						local317 = arg7.anInt9679 * (local24 >> 16);
						local24 += local55;
						for (local319 = -arg3; local319 < 0; local319++) {
							if (this.anIntArray24[local73] > local20) {
								local322 = arg7.anIntArray833[(local22 >> 16) + local317];
								local331 = arg1 + local322;
								local334 = (local322 & 0xFF00FF) + (arg1 & 0xFF00FF);
								local355 = (local334 & 0x1000100) + (local331 - local334 & 0x10000);
								local355 = local355 - (local355 >>> 8) | local331 - local355;
								local363 = (local355 >>> 24) * (arg1 >>> 24) >> 8;
								local371 = 256 - local363;
								if (local363 != 255) {
									local322 = local355;
									local355 = super.anIntArray130[local73];
									local355 = (local363 * (local322 & 0xFF00) + local371 * (local355 & 0xFF00) & 0xFF0000) + ((local355 & 0xFF00FF) * local371 + (local322 & 0xFF00FF) * local363 & 0xFF00FF00) >> 8;
								}
								super.anIntArray130[local73] = local355;
							}
							local73++;
							local22 += local49;
						}
						local73 += local189;
						local22 = local223;
					}
				} else if (arg2 == 2) {
					local223 = arg1 >>> 24;
					local313 = 256 - local223;
					local317 = (arg1 & 0xFF00FF) * local313 & 0xFF00FF00;
					local319 = (arg1 & 0xFF00) * local313 & 0xFF0000;
					local545 = (local317 | local319) >>> 8;
					local322 = local22;
					for (local331 = -arg0; local331 < 0; local331++) {
						local334 = arg7.anInt9679 * (local24 >> 16);
						for (local355 = -arg3; local355 < 0; local355++) {
							if (this.anIntArray24[local73] > local20) {
								local363 = arg7.anIntArray833[(local22 >> 16) + local334];
								local371 = local363 >>> 24;
								local319 = local223 * (local363 & 0xFF00) & 0xFF0000;
								local379 = 256 - local371;
								local317 = (local363 & 0xFF00FF) * local223 & 0xFF00FF00;
								local363 = local545 + ((local317 | local319) >>> 8);
								local1033 = super.anIntArray130[local73];
								super.anIntArray130[local73] = ((local1033 & 0xFF00FF) * local379 + (local363 & 0xFF00FF) * local371 & 0xFF00FF00) + (local379 * (local1033 & 0xFF00) + (local363 & 0xFF00) * local371 & 0xFF0000) >> 8;
							}
							local22 += local49;
							local73++;
						}
						local24 += local55;
						local22 = local322;
						local73 += local189;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else if (arg4 != 2) {
				throw new IllegalArgumentException();
			} else if (arg2 == 1) {
				local223 = local22;
				for (local313 = -arg0; local313 < 0; local313++) {
					local317 = arg7.anInt9679 * (local24 >> 16);
					local24 += local55;
					for (local319 = -arg3; local319 < 0; local319++) {
						if (this.anIntArray24[local73] > local20) {
							local322 = arg7.anIntArray833[local317 + (local22 >> 16)];
							if (local322 != 0) {
								local331 = super.anIntArray130[local73];
								local334 = local322 + local331;
								local355 = (local331 & 0xFF00FF) + (local322 & 0xFF00FF);
								@Pc(2028) int local2028 = (local355 & 0x1000100) + (local334 - local355 & 0x10000);
								super.anIntArray130[local73] = local2028 - (local2028 >>> 8) | -local2028 + local334;
							}
						}
						local73++;
						local22 += local49;
					}
					local73 += local189;
					local22 = local223;
				}
			} else if (arg2 == 0) {
				local223 = local22;
				local313 = arg1 >> 16 & 0xFF;
				local317 = arg1 >> 8 & 0xFF;
				local319 = arg1 & 0xFF;
				for (local322 = -arg0; local322 < 0; local322++) {
					local331 = arg7.anInt9679 * (local24 >> 16);
					for (local334 = -arg3; local334 < 0; local334++) {
						if (local20 < this.anIntArray24[local73]) {
							local355 = arg7.anIntArray833[(local22 >> 16) + local331];
							if (local355 != 0) {
								local363 = (local355 & 0xFF0000) * local313 & 0xFF000000;
								local371 = local317 * (local355 & 0xFF00) & 0xFF0000;
								local379 = (local355 & 0xFF) * local319 & 0xFF00;
								local355 = (local379 | local363 | local371) >>> 8;
								local1033 = super.anIntArray130[local73];
								local1041 = local355 + local1033;
								local1091 = (local355 & 0xFF00FF) + (local1033 & 0xFF00FF);
								@Pc(1915) int local1915 = (local1041 - local1091 & 0x10000) + (local1091 & 0x1000100);
								super.anIntArray130[local73] = local1915 - (local1915 >>> 8) | -local1915 + local1041;
							}
						}
						local22 += local49;
						local73++;
					}
					local24 += local55;
					local73 += local189;
					local22 = local223;
				}
			} else if (arg2 == 3) {
				local223 = local22;
				for (local313 = -arg0; local313 < 0; local313++) {
					local317 = (local24 >> 16) * arg7.anInt9679;
					local24 += local55;
					for (local319 = -arg3; local319 < 0; local319++) {
						if (this.anIntArray24[local73] > local20) {
							local322 = arg7.anIntArray833[(local22 >> 16) + local317];
							local331 = arg1 + local322;
							local334 = (arg1 & 0xFF00FF) + (local322 & 0xFF00FF);
							local355 = (local334 & 0x1000100) + (local331 - local334 & 0x10000);
							local322 = local355 - (local355 >>> 8) | -local355 + local331;
							local355 = super.anIntArray130[local73];
							local334 = (local322 & 0xFF00FF) + (local355 & 0xFF00FF);
							local331 = local322 + local355;
							local355 = (local334 & 0x1000100) + (local331 - local334 & 0x10000);
							super.anIntArray130[local73] = local331 - local355 | local355 + -(local355 >>> 8);
						}
						local22 += local49;
						local73++;
					}
					local73 += local189;
					local22 = local223;
				}
			} else if (arg2 == 2) {
				local223 = arg1 >>> 24;
				local313 = 256 - local223;
				local317 = local313 * (arg1 & 0xFF00FF) & 0xFF00FF00;
				local319 = (arg1 & 0xFF00) * local313 & 0xFF0000;
				local545 = (local319 | local317) >>> 8;
				local322 = local22;
				for (local331 = -arg0; local331 < 0; local331++) {
					local334 = arg7.anInt9679 * (local24 >> 16);
					for (local355 = -arg3; local355 < 0; local355++) {
						if (local20 < this.anIntArray24[local73]) {
							local363 = arg7.anIntArray833[local334 + (local22 >> 16)];
							if (local363 != 0) {
								local319 = local223 * (local363 & 0xFF00) & 0xFF0000;
								local317 = local223 * (local363 & 0xFF00FF) & 0xFF00FF00;
								local363 = ((local317 | local319) >>> 8) + local545;
								local371 = super.anIntArray130[local73];
								local379 = local371 + local363;
								local1033 = (local371 & 0xFF00FF) + (local363 & 0xFF00FF);
								local371 = (local1033 & 0x1000100) + (local379 - local1033 & 0x10000);
								super.anIntArray130[local73] = local379 - local371 | local371 - (local371 >>> 8);
							}
						}
						local73++;
						local22 += local49;
					}
					local24 += local55;
					local22 = local322;
					local73 += local189;
				}
			} else {
				throw new IllegalArgumentException();
			}
		} else if (arg2 == 1) {
			local223 = local22;
			for (local313 = -arg0; local313 < 0; local313++) {
				local317 = arg7.anInt9679 * (local24 >> 16);
				local24 += local55;
				for (local319 = -arg3; local319 < 0; local319++) {
					if (local20 < this.anIntArray24[local73]) {
						super.anIntArray130[local73] = arg7.anIntArray833[(local22 >> 16) + local317];
					}
					local22 += local49;
					local73++;
				}
				local22 = local223;
				local73 += local189;
			}
		} else if (arg2 == 0) {
			local223 = arg1 >> 16 & 0xFF;
			local313 = arg1 >> 8 & 0xFF;
			local317 = arg1 & 0xFF;
			local319 = local22;
			for (local322 = -arg0; local322 < 0; local322++) {
				local331 = (local24 >> 16) * arg7.anInt9679;
				for (local334 = -arg3; local334 < 0; local334++) {
					if (this.anIntArray24[local73] > local20) {
						local355 = arg7.anIntArray833[local331 + (local22 >> 16)];
						local363 = local223 * (local355 & 0xFF0000) & 0xFF000000;
						local371 = (local355 & 0xFF00) * local313 & 0xFF0000;
						local379 = (local355 & 0xFF) * local317 & 0xFF00;
						super.anIntArray130[local73] = (local379 | local363 | local371) >>> 8;
					}
					local22 += local49;
					local73++;
				}
				local24 += local55;
				local22 = local319;
				local73 += local189;
			}
		} else if (arg2 == 3) {
			local223 = local22;
			for (local313 = -arg0; local313 < 0; local313++) {
				local317 = (local24 >> 16) * arg7.anInt9679;
				for (local319 = -arg3; local319 < 0; local319++) {
					if (this.anIntArray24[local73] > local20) {
						local322 = arg7.anIntArray833[local317 + (local22 >> 16)];
						local331 = arg1 + local322;
						local334 = (local322 & 0xFF00FF) + (arg1 & 0xFF00FF);
						local355 = (local334 & 0x1000100) + (local331 - local334 & 0x10000);
						super.anIntArray130[local73] = local355 - (local355 >>> 8) | local331 + -local355;
					}
					local22 += local49;
					local73++;
				}
				local24 += local55;
				local73 += local189;
				local22 = local223;
			}
		} else if (arg2 == 2) {
			local223 = arg1 >>> 24;
			local313 = 256 - local223;
			local317 = (arg1 & 0xFF00FF) * local313 & 0xFF00FF00;
			local319 = (arg1 & 0xFF00) * local313 & 0xFF0000;
			local545 = (local317 | local319) >>> 8;
			local322 = local22;
			for (local331 = -arg0; local331 < 0; local331++) {
				local334 = arg7.anInt9679 * (local24 >> 16);
				for (local355 = -arg3; local355 < 0; local355++) {
					if (this.anIntArray24[local73] > local20) {
						local363 = arg7.anIntArray833[local334 + (local22 >> 16)];
						local317 = local223 * (local363 & 0xFF00FF) & 0xFF00FF00;
						local319 = local223 * (local363 & 0xFF00) & 0xFF0000;
						super.anIntArray130[local73] = ((local319 | local317) >>> 8) + local545;
					}
					local73++;
					local22 += local49;
				}
				local24 += local55;
				local22 = local322;
				local73 += local189;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!qda;IIII)Lclient!ba;")
	@Override
	public Class23 method5404(@OriginalArg(0) Class260 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class23_Sub3_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5396() {
		@Pc(10) Class179_Sub1 local10 = (Class179_Sub1) this.method1653(Thread.currentThread());
		@Pc(13) Class303 local13 = local10.aClass303_1;
		local13.aBoolean666 = local13.anInt8846 < 5 || local13.anInt8846 < 75 || local13.anInt8846 < 15;
		local13.aBoolean670 = false;
		@Pc(55) int local55 = 75 - super.anInt1829;
		@Pc(60) int local60 = 50 - super.anInt1808;
		@Pc(65) int local65 = 90 - super.anInt1808;
		@Pc(70) int local70 = 15 - super.anInt1829;
		@Pc(75) int local75 = 10 - super.anInt1808;
		@Pc(80) int local80 = 5 - super.anInt1829;
		local13.aBoolean668 = false;
		local13.anInt8842 = 0;
		local13.method7404(local75, local60, local65, local80, local55, local70, 100, 100, 100, -65536, -65536, -65536);
		local13.aBoolean670 = true;
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method1648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 == 0 || arg4 == 0) {
			return;
		}
		if (arg6 == 65535 || super.anInterface2_11.method3585(arg6).aBoolean656) {
			this.method499(arg0, arg2, arg7, arg1, arg3, arg9);
			return;
		}
		if (arg6 != super.lb) {
			@Pc(32) Class66 local32 = (Class66) super.aClass245_22.method6082((long) arg6);
			if (local32 == null) {
				@Pc(38) int[] local38 = this.method1650(arg6);
				if (local38 == null) {
					return;
				}
				@Pc(49) int local49 = this.method1643(arg6) ? 64 : 128;
				local32 = this.method5423(local38, local49, local49, local49);
				super.aClass245_22.method6075(local32, (long) arg6);
			}
			super.aClass66_19 = local32;
			super.lb = arg6;
		}
		this.method502(arg4 << 1, arg7, arg8, arg3 << 1, arg9, arg1 - arg4, arg0 - arg3, (Class66_Sub1_Sub3) super.aClass66_19, arg2);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "([Lclient!ba;Lclient!tg;Lclient!q;[Lclient!mr;I)V")
	@Override
	public void method5445(@OriginalArg(0) Class23[] arg0, @OriginalArg(1) Class299 arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) Class5_Sub4[] arg3, @OriginalArg(4) int arg4) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] != null) {
				((Class23_Sub3) arg0[local7]).method7100(arg2, arg3 == null ? null : arg3[local7], arg1, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) Class179_Sub1 local10 = (Class179_Sub1) this.method1653(Thread.currentThread());
		@Pc(13) Class303 local13 = local10.aClass303_1;
		@Pc(18) int local18 = arg2 - arg0;
		@Pc(23) int local23 = arg3 - arg1;
		@Pc(30) int local30 = local18 >= 0 ? local18 : -local18;
		@Pc(40) int local40 = local23 >= 0 ? local23 : -local23;
		@Pc(42) int local42 = local30;
		if (local40 > local30) {
			local42 = local40;
		}
		if (local42 == 0) {
			return;
		}
		@Pc(56) int local56 = (local18 << 16) / local42;
		local18 += local56 >> 16;
		@Pc(68) int local68 = (local23 << 16) / local42;
		local23 += local68 >> 16;
		if (local68 <= local56) {
			local56 = -local56;
		} else {
			local68 = -local68;
		}
		@Pc(95) int local95 = arg5 * local68 >> 17;
		@Pc(103) int local103 = local68 * arg5 + 1 >> 17;
		@Pc(109) int local109 = arg5 * local56 >> 17;
		@Pc(114) int local114 = arg0 - local13.method7412();
		@Pc(122) int local122 = arg5 * local56 + 1 >> 17;
		@Pc(127) int local127 = arg1 - local13.method7420();
		@Pc(131) int local131 = local114 + local95;
		@Pc(135) int local135 = local114 - local103;
		@Pc(142) int local142 = local114 + local18 - local103;
		@Pc(149) int local149 = local95 + local114 + local18;
		@Pc(154) int local154 = local127 + local109;
		@Pc(159) int local159 = local127 - local122;
		@Pc(166) int local166 = local23 + local127 - local122;
		@Pc(172) int local172 = local109 + local127 + local23;
		local13.anInt8842 = 0;
		local13.aBoolean666 = local131 < 0 || local131 > local13.anInt8846 || local135 < 0 || local135 > local13.anInt8846 || local142 < 0 || local13.anInt8846 < local142;
		local13.method7423(local154, local159, local166, local131, local135, local142, 0, 0, 0, arg4);
		local13.aBoolean666 = local131 < 0 || local131 > local13.anInt8846 || local142 < 0 || local142 > local13.anInt8846 || local149 < 0 || local13.anInt8846 < local149;
		local13.method7423(local154, local166, local172, local131, local142, local149, 0, 0, 0, arg4);
	}

	@OriginalMember(owner = "client!af", name = "e", descriptor = "(I)V")
	@Override
	public void method5426(@OriginalArg(0) int arg0) {
		super.aClass179Array3[arg0].method7256(null);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	@Override
	public Class62 method5415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class62_Sub1_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!af", name = "A", descriptor = "()Z")
	@Override
	public boolean method5458() {
		return true;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!uea;")
	@Override
	public Class179 method1653(@OriginalArg(0) Runnable arg0) {
		for (@Pc(7) int local7 = 0; local7 < super.anInt1805; local7++) {
			if (arg0 == super.aClass179Array3[local7].aRunnable3) {
				return super.aClass179Array3[local7];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!af", name = "n", descriptor = "()V")
	@Override
	public void method5430() {
		@Pc(35) int local35;
		@Pc(41) int local41;
		@Pc(43) int local43;
		if (super.anInt1813 == 0 && super.anInt1821 == super.anInt1832 && super.anInt1815 == 0 && super.anInt1830 == super.anInt1816) {
			local35 = this.anIntArray24.length;
			local41 = local35 - local35 & 0x7;
			local43 = 0;
			while (local43 < local41) {
				this.anIntArray24[local43++] = Integer.MAX_VALUE;
				this.anIntArray24[local43++] = Integer.MAX_VALUE;
				this.anIntArray24[local43++] = Integer.MAX_VALUE;
				this.anIntArray24[local43++] = Integer.MAX_VALUE;
				this.anIntArray24[local43++] = Integer.MAX_VALUE;
				this.anIntArray24[local43++] = Integer.MAX_VALUE;
				this.anIntArray24[local43++] = Integer.MAX_VALUE;
				this.anIntArray24[local43++] = Integer.MAX_VALUE;
			}
			while (local35 > local43) {
				this.anIntArray24[local43++] = Integer.MAX_VALUE;
			}
			return;
		}
		local35 = super.anInt1821 - super.anInt1813;
		local41 = -super.anInt1815 + super.anInt1830;
		local43 = super.anInt1832 - local35;
		@Pc(143) int local143 = super.anInt1813 + super.anInt1815 * super.anInt1832;
		@Pc(147) int local147 = local35 >> 3;
		@Pc(151) int local151 = local35 & 0x7;
		local35 = local143 - 1;
		for (@Pc(158) int local158 = -local41; local158 < 0; local158++) {
			@Pc(164) int local164;
			if (local147 > 0) {
				local164 = local147;
				do {
					local35++;
					this.anIntArray24[local35] = Integer.MAX_VALUE;
					local35++;
					this.anIntArray24[local35] = Integer.MAX_VALUE;
					local35++;
					this.anIntArray24[local35] = Integer.MAX_VALUE;
					local35++;
					this.anIntArray24[local35] = Integer.MAX_VALUE;
					local35++;
					this.anIntArray24[local35] = Integer.MAX_VALUE;
					local35++;
					this.anIntArray24[local35] = Integer.MAX_VALUE;
					local35++;
					this.anIntArray24[local35] = Integer.MAX_VALUE;
					local35++;
					this.anIntArray24[local35] = Integer.MAX_VALUE;
					local164--;
				} while (local164 > 0);
			}
			if (local151 > 0) {
				local164 = local151;
				do {
					local35++;
					this.anIntArray24[local35] = Integer.MAX_VALUE;
					local164--;
				} while (local164 > 0);
			}
			local35 += local43;
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5403(@OriginalArg(0) Canvas arg0) {
		@Pc(12) Class6_Sub13 local12 = (Class6_Sub13) super.aClass305_11.method7447((long) arg0.hashCode());
		if (local12 == null) {
			return;
		}
		local12.method8151();
		local12 = Static150.method6203(arg0);
		super.aClass305_11.method7448((long) arg0.hashCode(), local12);
		if (super.aCanvas5 != arg0 || super.aClass66_18 != null) {
			return;
		}
		super.anInt1832 = local12.anInt8669;
		super.aClass6_Sub13_3 = local12;
		super.anIntArray130 = local12.anIntArray729;
		super.anInt1816 = local12.anInt8670;
		if (this.anInt293 != super.anInt1832 || super.anInt1816 != this.anInt276) {
			this.anInt276 = super.anInt1816;
			this.anInt293 = super.anInt1832;
			this.anIntArray24 = new int[this.anInt276 * this.anInt293];
		}
		this.method1649();
		return;
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V")
	@Override
	public void method5394(@OriginalArg(0) int arg0) {
		super.anInt1805 = arg0;
		super.aClass179Array3 = new Class179_Sub1[super.anInt1805];
		for (@Pc(15) int local15 = 0; local15 < super.anInt1805; local15++) {
			super.aClass179Array3[local15] = new Class179_Sub1(this);
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!aca;IIII)V")
	@Override
	public void method1645(@OriginalArg(0) Class5_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) int local6 = arg0.anInt6013;
		@Pc(12) int local12 = arg4 << 1;
		if (local6 == -1) {
			this.method499(arg1, arg3, arg0.anInt6015, arg2, arg4, 1);
			return;
		}
		if (local6 != super.lb) {
			@Pc(43) Class66 local43 = (Class66) super.aClass245_22.method6082((long) local6);
			if (local43 == null) {
				@Pc(49) int[] local49 = this.method1650(local6);
				if (local49 == null) {
					return;
				}
				@Pc(59) int local59 = this.method1643(local6) ? 64 : 128;
				local43 = this.method5423(local49, local59, local59, local59);
				super.aClass245_22.method6075(local43, (long) local6);
			}
			super.aClass66_19 = local43;
			super.lb = local6;
		}
		local12++;
		this.method502(local12, arg0.anInt6015, 0, local12, 1, arg2 - arg4, -arg4 + arg1, (Class66_Sub1_Sub3) super.aClass66_19, arg3);
	}
}
